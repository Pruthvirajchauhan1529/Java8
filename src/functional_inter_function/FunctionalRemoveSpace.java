package functional_inter_function;

import java.util.function.*;

public class FunctionalRemoveSpace{
	public static void main(String[] args) {
		
		String s = "Durga software soluction Acadamy";
		Function<String,String> f1 = s1 -> s1.replaceAll(" ","");
		System.out.println(f1.apply(s));	

		Function<String,Integer> f2 = s1 -> s1.length() - s1.replaceAll(" ","").length();
		System.out.println(f2.apply(s));	
	}
}