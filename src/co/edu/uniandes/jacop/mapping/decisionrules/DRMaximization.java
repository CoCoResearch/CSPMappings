package co.edu.uniandes.jacop.mapping.decisionrules;

import org.jacop.constraints.XgtC;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMax;
import org.jacop.search.LargestDomain;
import org.jacop.search.LargestMax;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;
import org.jacop.search.SimpleSelect;

public class DRMaximization {
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

		IntVar[] Vars = new IntVar[9];
		Vars[0] = A1Cost;
		Vars[1] = A2Cost;
		Vars[2] = C1Cost;
		Vars[3] = C2Cost;
		Vars[4] = C3Cost;
		Vars[5] = E1Cost;
		Vars[6] = e1Cost;
		Vars[7] = e2Cost;
		Vars[8] = e3Cost;

		int maxValue = 3650;
		IntVar TotalCost = new IntVar(store, "TotalCost", 0, maxValue);

		store.impose(new org.jacop.constraints.Sum(Vars, TotalCost));
		store.impose(new XgtC(TotalCost, 0));

		Search<IntVar> search = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> select = new SimpleSelect<IntVar>(Vars, 
				new LargestMax<IntVar>(),
	    		new LargestDomain<IntVar>(),
	    		new IndomainMax<IntVar>());
		search.setOptimize(true);
		boolean result = search.labeling(store, select);

	}
}
