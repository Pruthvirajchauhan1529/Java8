package streams;

import java.util.ArrayList;
import java.util.stream.*;

public class ToArrayStreamDemo{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(5);
		list.add(0);
		list.add(10);
		list.add(30);
		list.add(25);

		System.out.println(list);
		
		Integer[] array = list.stream().toArray(Integer[]::new);
		// for (Integer x : array ) {
		// 			System.out.println(x);
		// 		}		
		list.stream().forEach(s->System.out.println(s));
		System.out.println("Stream consept of Group of values : ");
		Stream<Integer> s = Stream.	of(9,99,999,9999,99999,999999);
		s.forEach(System.out::println);

		System.out.println("Stream Consept Stream Also: ");
		Double[] d={10.3,30.40,20.25,50.35,40.45};
		Stream<Double> s2 = Stream.of(d);
		s2.forEach(System.out::println);
	} 
}