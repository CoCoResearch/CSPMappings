package co.edu.uniandes.choco.mapping.decisionrules;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class MappingDRFiniteRelation {

	public void solveProblem() {
		Solver solver = new Solver();

		int[] ints = new int[3];
		ints[0] = 3;
		ints[1] = 6;
		ints[2] = 7;
		IntVar A = VariableFactory.enumerated("A", ints, solver);

		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}
