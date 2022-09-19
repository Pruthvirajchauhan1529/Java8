package functional_inter_predicate;

import java.util.function.*;

class FunctionInterPredicateDemoS2{

	public static void main(String[] args) {
		
		Predicate<String> p = S -> S.length()>5;

		System.out.println(p.test("abcdefg"));
		System.out.println(p.test("abcd"));
	}
}