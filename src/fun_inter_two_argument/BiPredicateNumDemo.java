package fun_inter_two_argument;

import java.util.function.*;

public class BiPredicateNumDemo{
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> p = (a,b)-> (a+b) %2==0;

		System.out.println(p.test(10,20));
		System.out.println(p.test(15,20));
	}
}