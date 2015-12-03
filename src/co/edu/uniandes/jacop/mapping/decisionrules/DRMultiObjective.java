package co.edu.uniandes.jacop.mapping.decisionrules;

import org.jacop.constraints.XgtC;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMax;
import org.jacop.search.IndomainMin;
import org.jacop.search.LargestDomain;
import org.jacop.search.LargestMax;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;
import org.jacop.search.SimpleSelect;
import org.jacop.search.SmallestDomain;
import org.jacop.search.SmallestMin;

public class DRMultiObjective {
	public void solveProblem() {
		Store store = new Store();

		// Decision cost
		IntVar A1Cost = new IntVar(store, "A1Cost", 0, 500);
		IntVar A2Cost = new IntVar(store, "A2Cost", 0, 200);
		IntVar C1Cost = new IntVar(store, "C1Cost", 0, 600);
		IntVar C2Cost = new IntVar(store, "C2Cost", 0, 400);
		IntVar C3Cost = new IntVar(store, "C3Cost", 0, 300);
		IntVar E1Cost = new IntVar(store, "E1Cost", 0, 450);
		IntVar e1Cost = new IntVar(store, "e1Cost", 0, 350);
		IntVar e2Cost = new IntVar(store, "e2Cost", 0, 350);
		IntVar e3Cost = new IntVar(store, "e3Cost", 0, 500);

		// Decision time
		IntVar A1Time = new IntVar(store, "A1Time", 0, 20);
		IntVar A2Time = new IntVar(store, "A2Time", 0, 30);
		IntVar C1Time = new IntVar(store, "C1Time", 0, 10);
		IntVar C2Time = new IntVar(store, "C2Time", 0, 20);
		IntVar C3Time = new IntVar(store, "C3Time", 0, 30);
		IntVar E1Time = new IntVar(store, "E1Time", 0, 25);
		IntVar e1Time = new IntVar(store, "e1Time", 0, 15);
		IntVar e2Time = new IntVar(store, "e2Time", 0, 20);
		IntVar e3Time = new IntVar(store, "e3Time", 0, 25);

		IntVar[] Vars1 = new IntVar[9];
		Vars1[0] = A1Cost;
		Vars1[1] = A2Cost;
		Vars1[2] = C1Cost;
		Vars1[3] = C2Cost;
		Vars1[4] = C3Cost;
		Vars1[5] = E1Cost;
		Vars1[6] = e1Cost;
		Vars1[7] = e2Cost;
		Vars1[8] = e3Cost;
		
		IntVar[] Vars2 = new IntVar[9];
		Vars2[0] = A1Time;
		Vars2[1] = A2Time;
		Vars2[2] = C1Time;
		Vars2[3] = C2Time;
		Vars2[4] = C3Time;
		Vars2[5] = E1Time;
		Vars2[6] = e1Time;
		Vars2[7] = e2Time;
		Vars2[8] = e3Time;

		int maxCostValue = 3650;
		int maxTimeValue = 195;
		
		IntVar TotalCost = new IntVar(store, "TotalCost", 0, maxCostValue);
		IntVar TotalTime = new IntVar(store, "TotalTime", 0, maxTimeValue);
		
		store.impose(new org.jacop.constraints.Sum(Vars1, TotalCost));
		store.impose(new XgtC(TotalCost, 0));
		
		store.impose(new org.jacop.constraints.Sum(Vars2, TotalTime));
		store.impose(new XgtC(TotalTime, 0));

		Search<IntVar> slave = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> selectSlave =
				new SimpleSelect<IntVar>(Vars2,
						new LargestMax<IntVar>(),
						new LargestDomain<IntVar>(),
						new IndomainMax<IntVar>());
		slave.setSelectChoicePoint(selectSlave);
		
		Search<IntVar> master = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> selectMaster =
				new SimpleSelect<IntVar>(Vars1,
						new SmallestMin<IntVar>(),
			    		new SmallestDomain<IntVar>(),
			    		new IndomainMin<IntVar>());
		master.addChildSearch(slave);
		boolean result = master.labeling(store, selectMaster);
	}
}
