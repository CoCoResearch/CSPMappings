package co.edu.uniandes.jacop.mapping.decisionrules;

import org.jacop.constraints.IfThen;
import org.jacop.constraints.XeqC;
import org.jacop.core.BooleanVar;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMiddle;
import org.jacop.search.InputOrderSelect;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;

public class DRMandatory {
	public void solveProblem() {
		Store store = new Store();

		BooleanVar A = new BooleanVar(store, "A");
		BooleanVar B = new BooleanVar(store, "B");
		BooleanVar B1 = new BooleanVar(store, "B1");

		BooleanVar[] Vars = new BooleanVar[3];
		Vars[0] = A;
		Vars[1] = B;
		Vars[2] = B1;

		store.impose(new XeqC(B1, 1));
		store.impose(new IfThen(new XeqC(B1, 1), new XeqC(B, 1)));

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
