package functional_inter_function;

import java.util.function.*;

public class FunctionalFunLeng{
	public static void main(String[] args) {
		Function<String, Integer> f = s ->s.length();
		System.out.println(f.apply("Pruthviraj"));
		System.out.println(f.apply("Niketan"));
		System.out.println("-------------------------");
		Function<Integer, Integer> f1 = i -> i*i;
		System.out.println(f1.apply(6));
		System.out.println(f1.apply(9));
	}
}