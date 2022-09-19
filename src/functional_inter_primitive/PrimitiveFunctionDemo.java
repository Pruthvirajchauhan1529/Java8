package functional_inter_primitive;

import java.util.function.*;

public class PrimitiveFunctionDemo{
	public static void main(String[] args) {

		
		System.out.println("IntFunction Using: ");
		IntFunction<Integer> f1 = i -> i*i;
		System.out.println(f1.apply(6));
		System.out.println("-----------------------------");
		System.out.println("ToIntFunction Using: ");
		ToIntFunction<String> f2 = s -> s.length();
		System.out.println(f2.applyAsInt("Pruthviraj"));
		System.out.println("-----------------------------");
		System.out.println("ToIntFunction Using: ");
		IntToDoubleFunction f3 = s -> Math.sqrt(s);
		System.out.println(f3.applyAsDouble(5));
		System.out.println("-----------------------------");

	}
}