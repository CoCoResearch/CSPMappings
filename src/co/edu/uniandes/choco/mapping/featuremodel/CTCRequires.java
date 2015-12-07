package co.edu.uniandes.choco.mapping.featuremodel;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class CTCRequires {

	public void solveProblem() {
		Solver solver = new Solver();

		BoolVar A = VariableFactory.bool("A", solver);
		BoolVar B = VariableFactory.bool("B", solver);
		BoolVar C = VariableFactory.bool("C", solver);

		SatFactory.addClauses(LogOp.implies(A, C), solver);
		SatFactory.addClauses(LogOp.implies(LogOp.and(A), C), solver);

		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}
