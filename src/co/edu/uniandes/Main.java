package co.edu.uniandes;

import co.edu.uniandes.choco.scenarios.Scenario04Team01;
import co.edu.uniandes.jacop.scenarios.Scenario03Team01;
import co.edu.uniandes.jacop.scenarios.Scenario03Team03;


public class Main {

	public static void main(String[] args) {
		/*
		 * Model1 model1 = new Model1(); model1.solveProblem();
		 */

		//DRMultiObjective model1 = new DRMultiObjective();
		//model1.solveProblem();
		long start = System.currentTimeMillis();
		Scenario04Team01 scenario = new Scenario04Team01();
		scenario.solveProblem();
		long end = System.currentTimeMillis();
		System.out.println("Tiempo ejecución: " + (end - start));
	}
}
