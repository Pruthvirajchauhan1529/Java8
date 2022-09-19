package streams;

import java.util.* 	;
import java.util.stream.*;

public class StreamsDemo1{
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(15);
		l.add(25);
		l.add(10);
		l.add(30);
		l.add(20);

		for (Integer i : l ) {
			System.out.print(i+" ");
		}
		System.out.println();
		List<Integer> l1 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);

		List<Integer> l2 = l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l2);
	}
}