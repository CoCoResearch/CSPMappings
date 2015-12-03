package co.edu.uniandes.choco.mapping.decisionrules;

import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class MappingDRMultiObjective {

	public void solveProblem() {
		Solver solver = new Solver();

		// Decision selection
		BoolVar Root = (BoolVar) VariableFactory.fixed(1, solver);
		BoolVar A = (BoolVar) VariableFactory.fixed(1, solver);
		BoolVar B = (BoolVar) VariableFactory.fixed(1, solver);
		BoolVar C = (BoolVar) VariableFactory.fixed(1, solver);
		BoolVar D = VariableFactory.bool("D", solver);
		BoolVar E = VariableFactory.bool("E", solver);
		BoolVar A1 = VariableFactory.bool("A1", solver);
		BoolVar A2 = VariableFactory.bool("A2", solver);
		BoolVar C1 = VariableFactory.bool("C1", solver);
		BoolVar C2 = VariableFactory.bool("C2", solver);
		BoolVar C3 = VariableFactory.bool("C3", solver);
		BoolVar E1 = VariableFactory.bool("E1", solver);
		BoolVar E2 = VariableFactory.bool("E2", solver);
		BoolVar e1 = VariableFactory.bool("e1", solver);
		BoolVar e2 = VariableFactory.bool("e2", solver);
		BoolVar e3 = VariableFactory.bool("e3", solver);

		// Decision cost
		IntVar A1Cost = VariableFactory.bounded("A1Cost", 0, 500, solver);
		IntVar A2Cost = VariableFactory.bounded("A2Cost", 0, 200, solver);
		IntVar C1Cost = VariableFactory.bounded("C1Cost", 0, 600, solver);
		IntVar C2Cost = VariableFactory.bounded("C2Cost", 0, 400, solver);
		IntVar C3Cost = VariableFactory.bounded("C3Cost", 0, 300, solver);
		IntVar E1Cost = VariableFactory.bounded("E1Cost", 0, 450, solver);
		IntVar e1Cost = VariableFactory.bounded("e1Cost", 0, 350, solver);
		IntVar e2Cost = VariableFactory.bounded("e2Cost", 0, 350, solver);
		IntVar e3Cost = VariableFactory.bounded("e3Cost", 0, 500, solver);

		// Decision time
		IntVar A1Time = VariableFactory.bounded("A1Time", 0, 20, solver);
		IntVar A2Time = VariableFactory.bounded("A2Time", 0, 30, solver);
		IntVar C1Time = VariableFactory.bounded("C1Time", 0, 10, solver);
		IntVar C2Time = VariableFactory.bounded("C2Time", 0, 20, solver);
		IntVar C3Time = VariableFactory.bounded("C3Time", 0, 30, solver);
		IntVar E1Time = VariableFactory.bounded("E1Time", 0, 25, solver);
		IntVar e1Time = VariableFactory.bounded("e1Time", 0, 15, solver);
		IntVar e2Time = VariableFactory.bounded("e2Time", 0, 20, solver);
		IntVar e3Time = VariableFactory.bounded("e3Time", 0, 25, solver);

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

		int costsMaxValue = 3650;
		IntVar TotalCost = VariableFactory.bounded("TotalCost", 0,
				costsMaxValue, solver);

		int timeMaxValue = 195;
		IntVar TotalTime = VariableFactory.bounded("TotalTime", 0,
				timeMaxValue, solver);

		solver.post(IntConstraintFactory.sum(Vars1, TotalCost));
		solver.post(IntConstraintFactory.sum(Vars2, TotalTime));

		Chatterbox.showSolutions(solver);
		solver.findParetoFront(ResolutionPolicy.MAXIMIZE, TotalCost, TotalTime);
		Chatterbox.printStatistics(solver);
	}
}
