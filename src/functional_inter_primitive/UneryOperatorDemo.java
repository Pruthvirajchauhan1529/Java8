package functional_inter_primitive;

import java.util.function.*;

public class UneryOperatorDemo{
	public static void main(String[] args) {

		UnaryOperator<Integer> u = i -> i*i;
		System.out.println(u.apply(5));
		System.out.println(u.apply(15));
		System.out.println("----------");
		IntUnaryOperator u2 = i -> i*i;
		System.out.println(u2.applyAsInt(30));
		System.out.println(u2.applyAsInt(25));
	}
}