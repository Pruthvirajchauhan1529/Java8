package lambda_expression_with_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;

public class CompereLambdaDemo{
	public static void main(String[] args) {
		// ArrayList<Integer> list = new ArrayList<>();	

		// list.add(10);
		// list.add(20);	
		// list.add(5);	
		// list.add(15);	
		// list.add(30);	
		// list.add(25);
		ArrayList<String> list = new ArrayList<>();	

		list.add("Bhavin");
		list.add("Avantika");	
		list.add("Chirag");	
		list.add("Dhruv");	
		list.add("Nilesh");	
		list.add("Maulik");

		System.out.println("Befor Sorting: "+list);	
		Collections.sort(list);
		System.out.println("After Sorting: "+list);
		Collections.sort(list, (I1,I2)-> (I1>I2)?-1:(I1<I2)?1:0 );
		System.out.println("Ascending order: "+list);

	}
}