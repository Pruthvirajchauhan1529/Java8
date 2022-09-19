package functional_inter_predicate;

import java.util.function.*;
	
public class FunctionInterPredicateDemo{
	public static void main(String[] args) {
		
		Predicate<Integer> p = I -> I>10;

		System.out.println(p.test(100));
		System.out.println(p.test(4));
	}
}