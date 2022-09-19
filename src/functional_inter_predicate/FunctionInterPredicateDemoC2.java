package functional_inter_predicate;

import java.util.function.*;
import java.util.*;

class FunctionInterPredicateDemoC2{
	public static void main(String[] args) {

		Predicate<Collection> p = c -> c.isEmpty();

		ArrayList al1 = new ArrayList();
		//al1.add("ABC");
		al1.add(null);
		System.out.println(p.test(al1));

		ArrayList al2 = new ArrayList();

		System.out.println(p.test(al2));
	}
}