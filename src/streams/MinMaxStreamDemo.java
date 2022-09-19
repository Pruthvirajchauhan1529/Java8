package streams;

import java.util.ArrayList;

public class MinMaxStreamDemo{
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(5);
		list.add(0);
		list.add(10);
		list.add(30);
		list.add(25);

		System.out.println("ArrayList : "+list);
		Integer min = list.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("Minimum Value : "+min);

		Integer max = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Miximum Value : "+max);

		//list.stream().forEach(s->System.out.println(s));
		list.stream().forEach(System.out :: println);
	}
}