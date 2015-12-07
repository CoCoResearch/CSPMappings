package co.edu.uniandes.choco.mapping.featuremodel;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class TCOptional {

	public void solveProblem() {
		Solver solver = new Solver();

		// Optional for child feature of root node
		BoolVar A = VariableFactory.bool("A", solver);
		BoolVar A1 = VariableFactory.bool("A1", solver);

		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}
