package co.edu.uniandes;

import co.edu.uniandes.choco.mapping.featuremodel.MappingTCOr;
import co.edu.uniandes.jacop.mapping.featuremodel.TCAlternative;
import co.edu.uniandes.jacop.mapping.featuremodel.TCMandatory;
import co.edu.uniandes.jacop.mapping.featuremodel.TCOptional;
import co.edu.uniandes.jacop.mapping.featuremodel.TCOr;

public class Main {

	public static void main(String [] args)
	{
		/*Model1 model1 = new Model1();
		model1.solveProblem();*/
		
		TCAlternative model1 = new TCAlternative();
		model1.solveProblem();
	}
}
