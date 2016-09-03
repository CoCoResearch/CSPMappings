
package co.edu.uniandes.choco.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.search.solution.Solution;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test {
	public static void main(String[] args) {
		Solver solver = new Solver();
		
		//FEATURES
		BoolVar Root_Root = VariableFactory.bool("Root_Root", solver);
		BoolVar Root_A = VariableFactory.bool("Root_A", solver);
		BoolVar Root_A1 = (BoolVar) VariableFactory.fixed("Root_A1", 1, solver);
		BoolVar Root_A2 = VariableFactory.bool("Root_A2", solver);
		BoolVar Root_A3 = VariableFactory.bool("Root_A3", solver);
		BoolVar Root_B = VariableFactory.bool("Root_B", solver);
		BoolVar Root_C = VariableFactory.bool("Root_C", solver);
		BoolVar Root_C1 = VariableFactory.bool("Root_C1", solver);
		BoolVar Root_C2 = (BoolVar) VariableFactory.fixed("Root_C2", 0, solver);
		BoolVar Root_C3 = VariableFactory.bool("Root_C3", solver);
		BoolVar Root_D = VariableFactory.bool("Root_D", solver);
		BoolVar Root_D1 = VariableFactory.bool("Root_D1", solver);
		BoolVar Root_D2 = VariableFactory.bool("Root_D2", solver);
		int contFeatures = 15;
		
		//ATTRIBUTE TYPES
		HashMap<String, IntVar> featureAttrTime = new HashMap<String, IntVar>();
		HashMap<String, IntVar> featureAttrSecurity = new HashMap<String, IntVar>();
		HashMap<String, IntVar> featureAttrCosts = new HashMap<String, IntVar>();
		
		//FEATURE ATTRIBUTES
		featureAttrCosts.put("Root_A1", VariableFactory.enumerated("Root_A1Costs", new int[]{0, (int)Math.round(100)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A1, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("Root_A1"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A1, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("Root_A1"), "!=", 0));
		featureAttrTime.put("Root_A1", VariableFactory.enumerated("Root_A1Time", new int[]{0, 1}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A1, "=", 0), IntConstraintFactory.arithm(featureAttrTime.get("Root_A1"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A1, "=", 1), IntConstraintFactory.arithm(featureAttrTime.get("Root_A1"), "!=", 0));
		featureAttrSecurity.put("Root_A1", VariableFactory.enumerated("Root_A1Security", new int[]{0, (int)Math.round(1)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A1, "=", 0), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_A1"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A1, "=", 1), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_A1"), "!=", 0));
		featureAttrCosts.put("Root_A2", VariableFactory.enumerated("Root_A2Costs", new int[]{0, (int)Math.round(250)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A2, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("Root_A2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A2, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("Root_A2"), "!=", 0));
		featureAttrTime.put("Root_A2", VariableFactory.enumerated("Root_A2Time", new int[]{0, 2}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A2, "=", 0), IntConstraintFactory.arithm(featureAttrTime.get("Root_A2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A2, "=", 1), IntConstraintFactory.arithm(featureAttrTime.get("Root_A2"), "!=", 0));
		featureAttrSecurity.put("Root_A2", VariableFactory.enumerated("Root_A2Security", new int[]{0, (int)Math.round(2)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A2, "=", 0), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_A2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A2, "=", 1), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_A2"), "!=", 0));
		featureAttrCosts.put("Root_A3", VariableFactory.enumerated("Root_A3Costs", new int[]{0, (int)Math.round(375)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A3, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("Root_A3"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A3, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("Root_A3"), "!=", 0));
		featureAttrTime.put("Root_A3", VariableFactory.enumerated("Root_A3Time", new int[]{0, 1}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A3, "=", 0), IntConstraintFactory.arithm(featureAttrTime.get("Root_A3"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A3, "=", 1), IntConstraintFactory.arithm(featureAttrTime.get("Root_A3"), "!=", 0));
		featureAttrSecurity.put("Root_A3", VariableFactory.enumerated("Root_A3Security", new int[]{0, (int)Math.round(3)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A3, "=", 0), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_A3"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A3, "=", 1), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_A3"), "!=", 0));
		featureAttrCosts.put("Root_B", VariableFactory.enumerated("Root_BCosts", new int[]{0, (int)Math.round(150)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_B, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("Root_B"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_B, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("Root_B"), "!=", 0));
		featureAttrTime.put("Root_B", VariableFactory.enumerated("Root_BTime", new int[]{0, 12}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_B, "=", 0), IntConstraintFactory.arithm(featureAttrTime.get("Root_B"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_B, "=", 1), IntConstraintFactory.arithm(featureAttrTime.get("Root_B"), "!=", 0));
		featureAttrSecurity.put("Root_B", VariableFactory.enumerated("Root_BSecurity", new int[]{0, (int)Math.round(4)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_B, "=", 0), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_B"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_B, "=", 1), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_B"), "!=", 0));
		featureAttrCosts.put("Root_C1", VariableFactory.enumerated("Root_C1Costs", new int[]{0, (int)Math.round(450)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C1, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("Root_C1"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C1, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("Root_C1"), "!=", 0));
		featureAttrTime.put("Root_C1", VariableFactory.enumerated("Root_C1Time", new int[]{0, 12}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C1, "=", 0), IntConstraintFactory.arithm(featureAttrTime.get("Root_C1"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C1, "=", 1), IntConstraintFactory.arithm(featureAttrTime.get("Root_C1"), "!=", 0));
		featureAttrSecurity.put("Root_C1", VariableFactory.enumerated("Root_C1Security", new int[]{0, (int)Math.round(4)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C1, "=", 0), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_C1"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C1, "=", 1), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_C1"), "!=", 0));
		featureAttrCosts.put("Root_C2", VariableFactory.enumerated("Root_C2Costs", new int[]{0, (int)Math.round(150)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C2, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("Root_C2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C2, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("Root_C2"), "!=", 0));
		featureAttrTime.put("Root_C2", VariableFactory.enumerated("Root_C2Time", new int[]{0, 6}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C2, "=", 0), IntConstraintFactory.arithm(featureAttrTime.get("Root_C2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C2, "=", 1), IntConstraintFactory.arithm(featureAttrTime.get("Root_C2"), "!=", 0));
		featureAttrSecurity.put("Root_C2", VariableFactory.enumerated("Root_C2Security", new int[]{0, (int)Math.round(4)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C2, "=", 0), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_C2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C2, "=", 1), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_C2"), "!=", 0));
		featureAttrCosts.put("Root_C3", VariableFactory.enumerated("Root_C3Costs", new int[]{0, (int)Math.round(500)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C3, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("Root_C3"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C3, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("Root_C3"), "!=", 0));
		featureAttrTime.put("Root_C3", VariableFactory.enumerated("Root_C3Time", new int[]{0, 6}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C3, "=", 0), IntConstraintFactory.arithm(featureAttrTime.get("Root_C3"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C3, "=", 1), IntConstraintFactory.arithm(featureAttrTime.get("Root_C3"), "!=", 0));
		featureAttrSecurity.put("Root_C3", VariableFactory.enumerated("Root_C3Security", new int[]{0, (int)Math.round(5)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C3, "=", 0), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_C3"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C3, "=", 1), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_C3"), "!=", 0));
		featureAttrCosts.put("Root_D1", VariableFactory.enumerated("Root_D1Costs", new int[]{0, (int)Math.round(500)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D1, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("Root_D1"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D1, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("Root_D1"), "!=", 0));
		featureAttrTime.put("Root_D1", VariableFactory.enumerated("Root_D1Time", new int[]{0, 6}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D1, "=", 0), IntConstraintFactory.arithm(featureAttrTime.get("Root_D1"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D1, "=", 1), IntConstraintFactory.arithm(featureAttrTime.get("Root_D1"), "!=", 0));
		featureAttrSecurity.put("Root_D1", VariableFactory.enumerated("Root_D1Security", new int[]{0, (int)Math.round(5)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D1, "=", 0), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_D1"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D1, "=", 1), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_D1"), "!=", 0));
		featureAttrCosts.put("Root_D2", VariableFactory.enumerated("Root_D2Costs", new int[]{0, (int)Math.round(150)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D2, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("Root_D2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D2, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("Root_D2"), "!=", 0));
		featureAttrTime.put("Root_D2", VariableFactory.enumerated("Root_D2Time", new int[]{0, 6}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D2, "=", 0), IntConstraintFactory.arithm(featureAttrTime.get("Root_D2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D2, "=", 1), IntConstraintFactory.arithm(featureAttrTime.get("Root_D2"), "!=", 0));
		featureAttrSecurity.put("Root_D2", VariableFactory.enumerated("Root_D2Security", new int[]{0, (int)Math.round(5)}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D2, "=", 0), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_D2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D2, "=", 1), IntConstraintFactory.arithm(featureAttrSecurity.get("Root_D2"), "!=", 0));
		
		//TREE CONSTRAINTS
		
		//Or
		SatFactory.addClauses(LogOp.implies(Root_Root, Root_B), solver);
		BoolVar[] varsOrRoot_A = new BoolVar[3];
		varsOrRoot_A[0] = Root_A1;
		varsOrRoot_A[1] = Root_A2;
		varsOrRoot_A[2] = Root_A3;
		SatFactory.addClauses(LogOp.implies(Root_A, LogOp.or(varsOrRoot_A)), solver);
		
		//Alternative
		BoolVar[] varsXorRoot_C = new BoolVar[3];
		varsXorRoot_C[0] = Root_C1;
		varsXorRoot_C[1] = Root_C2;
		varsXorRoot_C[2] = Root_C3;
		SatFactory.addClauses(LogOp.implies(Root_C1, LogOp.nor(Root_C2)), solver);
		SatFactory.addClauses(LogOp.implies(Root_C1, LogOp.nor(Root_C3)), solver);
		SatFactory.addClauses(LogOp.implies(Root_C2, LogOp.nor(Root_C3)), solver);
		SatFactory.addClauses(LogOp.implies(Root_C, LogOp.or(varsXorRoot_C)), solver);
		
		//Parent-child relation
		SatFactory.addClauses(LogOp.implies(Root_D, Root_D1), solver);
		SatFactory.addClauses(LogOp.implies(Root_A, Root_Root), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_Root, "=", 0), IntConstraintFactory.arithm(Root_A, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_A1, Root_A), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A, "=", 0), IntConstraintFactory.arithm(Root_A1, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_A2, Root_A), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A, "=", 0), IntConstraintFactory.arithm(Root_A2, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_A3, Root_A), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_A, "=", 0), IntConstraintFactory.arithm(Root_A3, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_B, Root_Root), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_Root, "=", 0), IntConstraintFactory.arithm(Root_B, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_C, Root_Root), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_Root, "=", 0), IntConstraintFactory.arithm(Root_C, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_C1, Root_C), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C, "=", 0), IntConstraintFactory.arithm(Root_C1, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_C2, Root_C), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C, "=", 0), IntConstraintFactory.arithm(Root_C2, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_C3, Root_C), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_C, "=", 0), IntConstraintFactory.arithm(Root_C3, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_D, Root_Root), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_Root, "=", 0), IntConstraintFactory.arithm(Root_D, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_D1, Root_D), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D, "=", 0), IntConstraintFactory.arithm(Root_D1, "=", 0));
		SatFactory.addClauses(LogOp.implies(Root_D2, Root_D), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(Root_D, "=", 0), IntConstraintFactory.arithm(Root_D2, "=", 0));
		
		//CROSS-TREE CONSTRAINTS
		
		//Implies
		SatFactory.addClauses(LogOp.implies(Root_D2, Root_A), solver);
		
		//Excludes
		SatFactory.addClauses(LogOp.implies(Root_C3, LogOp.nor(Root_A3)), solver);
		
		
		//SOLUTION CONSTRAINTS - DECISION RULES
		List<IntVar> varsCostsList = new ArrayList<IntVar>(featureAttrCosts.values());
		IntVar[] varsCosts = new IntVar[featureAttrCosts.values().size()];
			
		for(int i = 0; i < varsCostsList.size(); i++) {
			varsCosts[i] = (IntVar) varsCostsList.get(i);
		}		
		List<IntVar> varsTimeList = new ArrayList<IntVar>(featureAttrTime.values());
		IntVar[] varsTime = new IntVar[featureAttrTime.values().size()];
			
		for(int i = 0; i < varsTimeList.size(); i++) {
			varsTime[i] = (IntVar) varsTimeList.get(i);
		}
		
		//Hard limit
		int minValueTime = 1;
		int maxValueTime = 24;
		IntVar totalTime = VariableFactory.bounded("totalTime", minValueTime, maxValueTime, solver);
		solver.post(IntConstraintFactory.sum(varsTime, totalTime));
		
		//One-variable optimization
		IntVar totalCosts = VariableFactory.bounded("totalCosts", 0, 1000000, solver);
		solver.post(IntConstraintFactory.sum(varsCosts, totalCosts));
		solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, totalCosts);
		Chatterbox.printStatistics(solver);
	}
}

