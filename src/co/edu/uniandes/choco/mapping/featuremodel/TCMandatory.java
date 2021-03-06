package co.edu.uniandes.choco.mapping.featuremodel;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class TCMandatory {

	public void solveProblem() {
		Solver solver = new Solver();

		// Mandatory for child feature of root node
		BoolVar A = (BoolVar) VariableFactory.fixed(1, solver);
		BoolVar A1 = VariableFactory.bool("A1", solver);

		SatFactory.addClauses(LogOp.implies(A, A1), solver);

		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}

}
