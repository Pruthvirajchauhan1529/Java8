package functional_inter_primitive;

import java.util.function.*;

public class BinaryOperatorDemo{
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> f = (I1,I2)-> (I1*I2);
		System.out.println("Using BiFunction: ");
		System.out.println(f.apply(10,20));
		System.out.println(f.apply(15,5));
		System.out.println();
		System.out.println("Using BinaryOperator: ");
		BinaryOperator<String> b = (s1,s2)-> (s1+s2);
		System.out.println(b.apply("Durga"," Software"));
		System.out.println(b.apply("Pruthviraj"," Chauhan"));
	}
}