package functional_inter_primitive;

import java.util.function.*;
import java.util.ArrayList;

class Employee{
	String name;
	double salary;
	
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
}

public class PrimitiveObjConDemo{
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		populate(list);

		ObjDoubleConsumer<Employee> c = (e,d) -> e.salary= e.salary+d;
		for (Employee e : list) {
			c.accept(e,550.0);
		}

		for (Employee e : list ) {
			System.out.println("Employee Name: "+e.name);
			System.out.println("Employee salary: "+e.salary);
			System.out.println();
		}
	}

	public static void populate(ArrayList<Employee> list){

		list.add(new Employee("Durga",1000));
		list.add(new Employee("Bunny",2000));
		list.add(new Employee("Channy",3000));
		list.add(new Employee("Pinky",4000));
		list.add(new Employee("Sunny",5000));
	}
}