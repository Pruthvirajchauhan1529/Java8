package functional_inter_predicate;

import java.util.function.*;

class FunctionPredicateStartK{

	public static void main(String[] args) {
		
		String[] names={"Sunny","Karina","Malaika","katarina","Karishma","Kajol"};
		Predicate<String> startwith = s -> s.charAt(0)=='K' || s.charAt(0)=='k';
		System.out.println("The Name Start With K : ");
		for (String s : names ) {
			if(startwith.test(s)){
				System.out.println(s);
			}
		}
	}
}