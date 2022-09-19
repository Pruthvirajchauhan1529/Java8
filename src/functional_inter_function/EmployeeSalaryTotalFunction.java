package functional_inter_function;

import java.util.function.*;
import java.util.ArrayList;


class Employee{

	String name;
	double salary;
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	public String toString(){
		return name+" : "+salary;
	}
}

public class EmployeeSalaryTotalFunction{
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		populate(list);
		for (Employee e : list ) {
				System.out.println(e);	
		}
		Function<ArrayList<Employee>, Double> f = l ->{
			double total = 0;
			for (Employee e : l) {
				total = total + e.salary;
			}
			return total;
		};
		System.out.println("The total salary of this month: "+f.apply(list));
		System.out.println();

		//Increament Salary
		Predicate<Employee> p = e -> e.salary<3500;
		Function<Employee,Employee> f2 = e -> {
			e.salary = e.salary + 505;
			return e;
		};
		// for (Employee e : list) {
		// 	if (p.test(e)) {
		// 		System.out.println(f2.apply(e));
		// 	}
		// }
		System.out.println("After Increament salary: ");
		ArrayList<Employee> list2 = new ArrayList<>();
		for (Employee e : list) {
			if(p.test(e)){
				list2.add(f2.apply(e));
			}
		}
		System.out.println(list);
		System.out.println();
		System.out.println("Employee with Increament salary: ");
		System.out.println(list2);

	}
	public static void populate(ArrayList<Employee> list){
		list.add(new Employee("Sunny",1000));
		list.add(new Employee("Bunny",3000));
		list.add(new Employee("Maulik",5000));
		list.add(new Employee("Ketan",1500));
		list.add(new Employee("Ajay",6000));
		list.add(new Employee("Mayank",3000));

	}

}