package co.edu.uniandes.jacop.mapping.featuremodel;

import org.jacop.core.BooleanVar;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMiddle;
import org.jacop.search.InputOrderSelect;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;

public class TCOptional {
	public void solveProblem() {
		Store store = new Store();

		BooleanVar A = new BooleanVar(store, "A");
		BooleanVar A1 = new BooleanVar(store, "A1");

		BooleanVar[] Vars = new BooleanVar[2];
		Vars[0] = A;
		Vars[1] = A1;

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
