package fun_inter_two_argument;

import java.util.function.*;
import java.util.ArrayList;

class Employee01{
	String name;
	double salary;
 	public Employee01(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
}

public class BiConsumerEmployee{
	public static void main(String[] args) {
		ArrayList<Employee01> list = new ArrayList<>();

		BiFunction<String, Double, Employee01> f = (name,salary)-> new Employee01(name,salary);

		list.add(f.apply("Durga",1000.0));
		list.add(f.apply("Pratik",3000.0));
		list.add(f.apply("Sunny",2000.0));
		list.add(f.apply("Bunny",5000.0));

		BiConsumer<Employee01, Double> c = (e,d)->e.salary = e.salary + d;
		for (Employee01 e: list ) {
			c.accept(e,500.0);
		}
		for (Employee01 e : list ) {
			System.out.println("Employee Name: "+e.name);
			System.out.println("Employee Salary: "+e.salary);
			System.out.println();		
		}
	}
}