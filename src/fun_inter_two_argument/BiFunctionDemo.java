package fun_inter_two_argument;

import java.util.function.*;

public class BiFunctionDemo{
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> f = (a,b)-> (a*b);

		System.out.println(f.apply(10,20));
		System.out.println(f.apply(100,200));
	}
}