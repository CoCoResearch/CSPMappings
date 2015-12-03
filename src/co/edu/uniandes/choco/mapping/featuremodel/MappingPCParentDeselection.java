package co.edu.uniandes.choco.mapping.featuremodel;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class MappingPCParentDeselection {

	public void solveProblem() {
		Solver solver = new Solver( );
	
		BoolVar A = VariableFactory.bool("A", solver);
		BoolVar A1 = VariableFactory.bool("A1", solver);
		BoolVar A2 = VariableFactory.bool("A2", solver);
		
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(A, "=", 0), IntConstraintFactory.arithm(A1, "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(A, "=", 0), IntConstraintFactory.arithm(A2, "=", 0));
		
		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}
