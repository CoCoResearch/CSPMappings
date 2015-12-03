package co.edu.uniandes.choco.mapping.decisionrules;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class MappingDRMandatory {

	public void solveProblem() {
		Solver solver = new Solver();

		// Mandatory for child feature of root node
		BoolVar A = (BoolVar) VariableFactory.fixed(1, solver);
		BoolVar B = VariableFactory.bool("B", solver);

		BoolVar B1 = (BoolVar) VariableFactory.fixed(1, solver);

		SatFactory.addClauses(LogOp.implies(B1, B), solver);

		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}
