package co.edu.uniandes.choco.mapping.decisionrules;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class DRHardLimit {

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
		IntVar TotalCost = VariableFactory.bounded("TotalCost", 0, maxValue,
				solver);

		solver.post(IntConstraintFactory.sum(Vars, TotalCost));
		solver.post(IntConstraintFactory.arithm(TotalCost, ">", 100));
		solver.post(IntConstraintFactory.arithm(TotalCost, "<=", 110));

		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}
