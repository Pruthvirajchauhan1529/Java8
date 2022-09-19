package lambda_expression_with_collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee1{

	int eid;
	String ename;

	public Employee1(int eid, String ename){
		this.eid = eid;
		this.ename = ename;
	}
	public String toString(){
		return eid+ " : "+ ename;
	}
}

public class ObjEmployeeDemo{
	public static void main(String[] args) {
		
		ArrayList<Employee1> list = new ArrayList<>();
		list.add(new Employee1(103,"Mohit"));
		list.add(new Employee1(101,"Kavan"));
		list.add(new Employee1(104,"Dhaval"));
		list.add(new Employee1(102,"Akash"));
		list.add(new Employee1(105,"Bhavin"));

		System.out.println("Befor Sorting: "+list);
		Collections.sort(list,(e1,e2)->(e1.eid<e2.eid)?-1:(e1.eid>e2.eid)?1:0);
		System.out.println("After Sorting: "+list);
		for (Employee1 e : list ) {
			System.out.println(e);
		}
	}
}