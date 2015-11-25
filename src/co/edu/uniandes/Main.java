package co.edu.uniandes;

import co.edu.uniandes.choco.mapping.decisionrules.MappingDRFiniteRelation;
import co.edu.uniandes.choco.mapping.decisionrules.MappingDRHardLimit;
import co.edu.uniandes.choco.mapping.decisionrules.MappingDRMandatory;
import co.edu.uniandes.choco.mapping.decisionrules.MappingDRMaximization;
import co.edu.uniandes.choco.mapping.decisionrules.MappingDRMinimization;
import co.edu.uniandes.choco.mapping.decisionrules.MappingDRMultiObjective;
import co.edu.uniandes.choco.mapping.featuremodel.MappingCTCExcludes;
import co.edu.uniandes.choco.mapping.featuremodel.MappingCTCRequires;
import co.edu.uniandes.choco.mapping.featuremodel.MappingPCChildSelection;
import co.edu.uniandes.choco.mapping.featuremodel.MappingPCParentDeselection;
import co.edu.uniandes.choco.mapping.featuremodel.MappingTCAlternative;
import co.edu.uniandes.choco.mapping.featuremodel.MappingTCMandatory;
import co.edu.uniandes.choco.mapping.featuremodel.MappingTCOptional;
import co.edu.uniandes.choco.mapping.featuremodel.MappingTCOr;

public class Main {

	public static void main(String [] args)
	{
		/*Model1 model1 = new Model1();
		model1.solveProblem();*/
		
		MappingDRMultiObjective model1 = new MappingDRMultiObjective();
		model1.solveProblem();
	}
}
