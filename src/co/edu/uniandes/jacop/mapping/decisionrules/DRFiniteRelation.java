package co.edu.uniandes.jacop.mapping.decisionrules;

import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.jasat.utils.structures.IntSet;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMiddle;
import org.jacop.search.InputOrderSelect;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;

public class DRFiniteRelation {
	public void solveProblem() {
		Store store = new Store();

		IntSet Set = new IntSet();
		Set.add(3);
		Set.add(6);
		Set.add(7);

		IntVar A = new IntVar(store, "A");
		A.addDom(3, 3);
		A.addDom(6, 7);

		IntVar[] Vars = new IntVar[1];
		Vars[0] = A;

		Search<IntVar> search = new DepthFirstSearch<IntVar>();
		SelectChoicePoint<IntVar> select = new InputOrderSelect<IntVar>(store,
				Vars, new IndomainMiddle<IntVar>());
		search.getSolutionListener().searchAll(true);
		search.getSolutionListener().recordSolutions(true);
		boolean result = search.labeling(store, select);

		for (int i = 1; i <= search.getSolutionListener().solutionsNo(); i++) {
			System.out.print("Solution " + i + ":");

			for (int j = 0; j < search.getSolution(i).length; j++) {
				System.out.print(search.getSolution(i)[j]);
			}

			System.out.println();
		}
	}
}
