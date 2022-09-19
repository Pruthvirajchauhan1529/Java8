package streams;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

class StreamSortedDemo1{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(15);
		list.add(20);
		list.add(5);
		list.add(10);
		list.add(30);

		System.out.println(list);
		List<Integer> l1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println();
		System.out.print("Ascending Order Sorting: ");
		System.out.println(l1);
		
		l1.stream().forEach(s->System.out.println(s));

		List<Integer> l2 = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println();
		System.out.print("Descending Order Sorting: ");
		System.out.println(l2);

		l2.stream().forEach(System.out::println);
	}
}