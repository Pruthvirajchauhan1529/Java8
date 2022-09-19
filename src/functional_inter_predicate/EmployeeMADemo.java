package functional_inter_predicate;//Employee Management Application:
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

class Employee{
	String name;
	String designation;
	double salary;
	String city;

	public Employee(String name, String designation, double salary, String city){
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String toString(){
		String s = String.format("(%s,%s,%.2f,%s)",name,designation,salary,city);
		return s;
	}
}

public class EmployeeMADemo{
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		populate(list);
		Collections.sort(list, (e1,e2)-> (e1.getName().compareTo(e2.getName())));

		Predicate<Employee> P1 = emp -> emp.designation.equals("Java Developer");
		System.out.println("Java Developer Information: ");
		display(P1,list);
		
		Predicate<Employee> P2 = emp -> emp.city.equals("Ahmedabad");
		System.out.println("Ahmedabad Employee Information: ");
		display(P2,list);

		Predicate<Employee> P3 = emp -> emp.salary<20000;
		System.out.println("All Employee Information who salary <20000: ");
		display(P3,list);

		System.out.println("All Java Developer from Ahmedabad to give pink slip: ");
		display(P1.and(P2),list);

		System.out.println("All Employee who are java Developer or salary <20000: ");
		display(P1.or(P3),list);

		System.out.println("To select all Employee who are not Java Developer: ");
		display(P1.negate(),list);		

	}
	public static void populate(ArrayList<Employee> list){
		list.add(new Employee("Pruthviraj","Java Developer",50000,"Ahmedabad"));
		list.add(new Employee("Dhruv","Python Developer",45000,"Surat"));
		list.add(new Employee("Ankita","HR",40000,"Ahmedabad"));
		list.add(new Employee("Darshan","Angular Developer",38000,"Rajkot"));
		list.add(new Employee("Falgun","PHP Developer",30000,"Jamnagar"));
		list.add(new Employee("Priti","HR",35000,"Ahmedabad"));
		list.add(new Employee("Ankur","Java Developer",19000,"Gandhinagar"));
		list.add(new Employee("Bhavin","PHP Developer",18000,"Jamnagar"));
	}
	public static void display(Predicate<Employee> p, ArrayList<Employee> list){
		for (Employee em : list) {
			if(p.test(em)){
				System.out.println(em);
			}
		}
		System.out.println("-----------------------------------------------------------------");
	}
}