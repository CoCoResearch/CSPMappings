package co.edu.uniandes.choco.mapping.featuremodel;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class MappingTCOr {

	/**
	 * Postcondition: at least one feature should be selected under an or
	 * relation.
	 */
	public void solveProblem() {
		Solver solver = new Solver();

		// Two child features (Or Relation)
		BoolVar A1 = VariableFactory.bool("A1", solver);
		BoolVar A2 = VariableFactory.bool("A2", solver);

		// More than two child features (Or Relation)
		BoolVar B1 = VariableFactory.bool("B1", solver);
		BoolVar B2 = VariableFactory.bool("B2", solver);
		BoolVar B3 = VariableFactory.bool("B3", solver);

		SatFactory.addClauses(LogOp.or(A1, A2), solver);

		BoolVar[] varsOr = new BoolVar[3];
		varsOr[0] = B1;
		varsOr[1] = B2;
		varsOr[2] = B3;
		SatFactory.addClauses(LogOp.or(varsOr), solver);

		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}
