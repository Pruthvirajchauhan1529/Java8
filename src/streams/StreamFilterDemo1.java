package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StreamFilterDemo1{
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Pavan");
		list.add("Sharukh Khan");
		list.add("Akshay Kumar");
		list.add("Ranvir");
		list.add("Amir Khan");

		System.out.println(list);	

		List<String> l1 = list.stream().filter(s-> s.length()>=9).collect(Collectors.toList());
		System.out.println(l1);

		List<String> l2 = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);

		long count = list.stream().filter(s->s.length()>=9).count();
		System.out.println("The number of Strings whose length >=9: "+count);
	}
}