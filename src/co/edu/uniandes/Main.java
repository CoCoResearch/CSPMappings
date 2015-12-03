package co.edu.uniandes;

import co.edu.uniandes.jacop.mapping.featuremodel.CTCExcludes;
import co.edu.uniandes.jacop.mapping.featuremodel.PCChildSelection;
import co.edu.uniandes.jacop.mapping.featuremodel.PCParentDeselection;

public class Main {

	public static void main(String [] args)
	{
		/*Model1 model1 = new Model1();
		model1.solveProblem();*/
		
		PCParentDeselection model1 = new PCParentDeselection();
		model1.solveProblem();
	}
}
