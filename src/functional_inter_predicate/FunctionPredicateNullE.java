package functional_inter_predicate;

import java.util.function.*;
import java.util.ArrayList;

public class FunctionPredicateNullE{
	public static void main(String[] args) {
		
		String[] names={"Durga","",null,"Ravi","","Dharmesh",null};

		Predicate<String> p = s -> s != null && s.length() != 0;

		ArrayList<String> list = new ArrayList<>();
		for (String  s : names ) {
			if(p.test(s)){
				list.add(s);	
			}
		}
		System.out.println("The list of available String: "+list);
	}
}