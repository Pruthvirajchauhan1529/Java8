package lambda_expression_with_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	public int compare(Integer I1, Integer I2){
		return (I1>I2)?-1 : (I1<I2)?1 : 0;
	}
}

class CompereDemo{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();	

		list.add(10);
		list.add(20);	
		list.add(5);	
		list.add(15);	
		list.add(30);	
		list.add(25);

		System.out.println("Befor Sorting: "+list);	
		Collections.sort(list);
		System.out.println("After Sorting: "+list);
		Collections.sort(list, new MyComparator());
		System.out.println("Ascending order: "+list);

	}
}