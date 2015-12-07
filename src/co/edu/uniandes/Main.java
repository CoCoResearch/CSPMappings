package co.edu.uniandes;

import co.edu.uniandes.choco.scenarios.Scenario05Team02;

public class Main {

	public static void main(String[] args) {
		/*
		 * Model1 model1 = new Model1(); model1.solveProblem();
		 */

		//DRMultiObjective model1 = new DRMultiObjective();
		//model1.solveProblem();
		long start = System.currentTimeMillis();
		Scenario05Team02 scenario = new Scenario05Team02();
		scenario.solveProblem();
		long end = System.currentTimeMillis();
		System.out.println("Tiempo ejecución: " + (end - start));
	}
}
