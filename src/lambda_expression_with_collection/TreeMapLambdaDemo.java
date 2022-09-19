package lambda_expression_with_collection;

import java.util.Map;
import java.util.TreeMap;

class TreeMapLambdaDemo{
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();

		map.put(40,"Pratik");
		map.put(20,"Niketan");
		map.put(30,"Bhavik");
		map.put(50,"Avinash");
		map.put(10,"Dhruv");

		System.out.println(map);

		for (Map.Entry m : map.entrySet() ) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}