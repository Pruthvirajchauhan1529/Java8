package functional_inter_predicate;

import java.util.function.*;

public class FunctionPredicateJoinDemo{

	public static void m1(Predicate<Integer> p,int[] x){
		for (int x1 :x ) {
			if(p.test(x1)){
				System.out.println(x1);
			}
		}
	}

	public static void main(String[] args) {
		
		int[] x={0,5,10,15,20,25,30};
		Predicate<Integer> p1 = I -> I>10;
		Predicate<Integer> p2 = I -> I%2 == 0;

		System.out.println("The Number greater then 10 are: ");
		m1(p1,x);
		System.out.println("The Even Numbers are: ");
		m1(p2,x);
		System.out.println("The Numbers not greater then 10 are: ");
		m1(p1.negate(),x);
		System.out.println("The Numbers greater then 10 and even Numbers are: ");
		m1(p1.and(p2),x);
		System.out.println("The Numbers greater then 10 or even Numbers are: ");
		m1(p2.or(p2),x);
	}
}