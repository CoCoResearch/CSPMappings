package co.edu.uniandes.choco.scenarios;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class Scenario1 {

	private Solver solver;

	public Scenario1() {
		this.solver = new Solver();
	}

	public void solveProblem() {

		// ----------------------------------------
		// VARIABLES
		// ----------------------------------------

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

		// ----------------------------------------
		// TREE CONSTRAINTS
		// ----------------------------------------

		// Mandatory
		SatFactory.addClauses(LogOp.implies(E, E1), solver);

		// Or
		SatFactory.addClauses(LogOp.or(A1, A2), solver);
		/*
		 * BoolVar[] varsOr1 = new BoolVar[3]; varsOr1[0] = e1; varsOr1[1] = e2;
		 * varsOr1[2] = e3; SatFactory.addClauses(LogOp.or(varsOr1), solver);
		 */

		// Alternative
		BoolVar[] varsXor1 = new BoolVar[3];
		varsXor1[0] = C1;
		varsXor1[1] = C2;
		varsXor1[2] = C3;
		SatFactory.addClauses(LogOp.or(varsXor1), solver);
		SatFactory.addClauses(LogOp.ifOnlyIf(C1, LogOp.nor(C2)), solver);
		SatFactory.addClauses(LogOp.ifOnlyIf(C1, LogOp.nor(C3)), solver);
		SatFactory.addClauses(LogOp.ifOnlyIf(C2, LogOp.nor(C3)), solver);

		BoolVar[] varsXor2 = new BoolVar[3];
		varsXor2[0] = e1;
		varsXor2[1] = e2;
		varsXor2[2] = e3;
		SatFactory.addClauses(LogOp.or(varsXor2), solver);
		SatFactory.addClauses(LogOp.ifOnlyIf(e1, LogOp.nor(e2)), solver);
		SatFactory.addClauses(LogOp.ifOnlyIf(e1, LogOp.nor(e3)), solver);
		SatFactory.addClauses(LogOp.ifOnlyIf(e2, LogOp.nor(e3)), solver);

		// ----------------------------------------
		// CROSS-TREE CONSTRAINTS
		// ----------------------------------------

		Chatterbox.showSolutions(solver);
		// SMF.limitTime(solver, 5000);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}
