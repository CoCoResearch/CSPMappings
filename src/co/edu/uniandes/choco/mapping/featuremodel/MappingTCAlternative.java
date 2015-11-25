package co.edu.uniandes.choco.mapping.featuremodel;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class MappingTCAlternative {
	
	public void solveProblem() {
		Solver solver = new Solver( );
		
		// Two child features (Xor Relation)
		BoolVar A1 = VariableFactory.bool("A1", solver);
		BoolVar A2 = VariableFactory.bool("A2", solver);
		
		// More than two child features (Xor Relation)
		BoolVar B1 = VariableFactory.bool("B1", solver);
		BoolVar B2 = VariableFactory.bool("B2", solver);
		BoolVar B3 = VariableFactory.bool("B3", solver);
		
		SatFactory.addClauses(LogOp.xor(A1, A2), solver);
		
		BoolVar[] varsXor = new BoolVar[3];
		varsXor[0] = B1;
		varsXor[1] = B2;
		varsXor[2] = B3;
		SatFactory.addClauses(LogOp.or(varsXor), solver);
		SatFactory.addClauses(LogOp.implies(B1,LogOp.nor(B2)), solver);
		SatFactory.addClauses(LogOp.implies(B1,LogOp.nor(B3)), solver);
		SatFactory.addClauses(LogOp.implies(B2,LogOp.nor(B3)), solver);
		
		Chatterbox.showSolutions(solver);
		System.out.println(solver.findAllSolutions());
		Chatterbox.printStatistics(solver);
	}
}
