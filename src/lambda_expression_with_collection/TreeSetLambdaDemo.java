package lambda_expression_with_collection;

import java.util.TreeSet;

class TreeSetLambdaDemo{
	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);

		t.add(10);
		t.add(20);	
		t.add(5);	
		t.add(15);	
		t.add(30);	
		t.add(25);

		System.out.println(t);
		//Collection.sort(t,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);

		for (Integer I : t ) {
			System.out.println(I);
		}
	}
}