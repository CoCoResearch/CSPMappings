package co.edu.uniandes;

import co.edu.uniandes.mapping.MappingAlternative;
import co.edu.uniandes.mapping.MappingChildSelection;
import co.edu.uniandes.mapping.MappingMandatory;
import co.edu.uniandes.mapping.MappingOptional;
import co.edu.uniandes.mapping.MappingOr;
import co.edu.uniandes.mapping.MappingParentDeselection;

public class Main {

	public static void main(String [] args)
	{
		/*Model1 model1 = new Model1();
		model1.solveProblem();*/
		
		MappingParentDeselection model1 = new MappingParentDeselection();
		model1.solveProblem();
	}
}
