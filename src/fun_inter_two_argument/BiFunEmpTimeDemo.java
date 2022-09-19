package fun_inter_two_argument;

import java.util.function.*;

class Employee{
	int eno;
	String name;
	double dailywage;

	public Employee(int eno, String name, double dailywage){
		this.eno = eno;
		this.name = name;
		this.dailywage = dailywage;
	}
}
class TimeSheet{
	int eno;
	int days;

	public TimeSheet(int eno, int days){
		this.eno = eno;
		this.days = days;
	}
}
public class BiFunEmpTimeDemo{
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Vipul",1500);
		Employee e2 = new Employee(102,"Dhaval",1000);
		Employee e3 = new Employee(103,"Girish",1300);
		TimeSheet t1 = new TimeSheet(101,25);
		TimeSheet t2 = new TimeSheet(102,25);
		TimeSheet t3 = new TimeSheet(103,25);

		BiFunction<Employee,TimeSheet,Double> f = (e,t)-> e.dailywage * t.days;

		System.out.println("Name: "+e1.name+" Monthly salary : "+f.apply(e1,t1));
		System.out.println("Name: "+e2.name+" Monthly salary : "+f.apply(e2,t2));
		System.out.println("Name: "+e3.name+" Monthly salary : "+f.apply(e3,t3));

	}
}