package co.edu.uniandes;

import co.edu.uniandes.mapping.featuremodel.MappingCTCExcludes;
import co.edu.uniandes.mapping.featuremodel.MappingCTCRequires;
import co.edu.uniandes.mapping.featuremodel.MappingPCChildSelection;
import co.edu.uniandes.mapping.featuremodel.MappingPCParentDeselection;
import co.edu.uniandes.mapping.featuremodel.MappingTCAlternative;
import co.edu.uniandes.mapping.featuremodel.MappingTCMandatory;
import co.edu.uniandes.mapping.featuremodel.MappingTCOptional;
import co.edu.uniandes.mapping.featuremodel.MappingTCOr;

public class Main {

	public static void main(String [] args)
	{
		/*Model1 model1 = new Model1();
		model1.solveProblem();*/
		
		MappingCTCRequires model1 = new MappingCTCRequires();
		model1.solveProblem();
	}
}
