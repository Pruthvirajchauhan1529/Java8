package Task;//- Write a program for comparator using lambda.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{

	int roll;
	String name;
	String address;

	public Student(int roll,String name,String address){
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public int getRoll(){
		return roll;
	}
	public void setRoll(int roll){
		this.roll = roll;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}


	public String toString(){
		return "Roll No: "+roll+" Name: "+name+" Address: "+address;
	}
}

public class LambdaComparater03{
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(01,"Bhavin","Shahpur"));
		list.add(new Student(03,"Avantika","Bapunager"));
		list.add(new Student(02,"Chirag","Chankheda"));
		list.add(new Student(05,"Dhruv","Maninagar"));
		list.add(new Student(04,"Nilesh","Rakhiyal"));

		System.out.println("Before Sorting: "+list);

		Collections.sort(list, (s1,s2)-> (s1.roll<s2.roll)?-1:(s1.roll>s2.roll)?1:0);
		System.out.println("Sorted By the Number:");
		// for (Student s : list ) {
		// 	System.out.println("Roll Sorting: "+ s);
		// }
		list.forEach(s->System.out.println(s));
		// Collections.sort(list, new Comparator<Student>(){
		// 	@Override
		// 	public int compare(Student o1, Student o2){
		// 		return (int)(o1.getName().compareTo(o2.getName()));
		// 	}
		// } );
		System.out.println("Sorted By Name: ");
		Collections.sort(list, (s1,s2)-> (s1.getName().compareTo(s2.getName())));
			//System.out.println("Ascending Order: "+list);
		for (Student s : list ) {
			System.out.println("Name Sorting: "+ s);
		}
		System.out.println("Sorted By the Address:");
		Collections.sort(list,(s1,s2)->(s1.getAddress().compareTo(s2.getAddress())));
		for (Student st : list ) {
			System.out.println("Address Sorting: "+st);
		}
	}
}