package Task;



//import functional_inter_consumer.Student01;

import java.util.ArrayList;
import java.util.function.*;
class Student01{

	String name;
	int marks;
	public Student01(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	public String toString(){
		return "Student Name: "+name+" Student Marks: "+marks;
	}
}

class Student02{
	public static void populate(ArrayList<Student01> list){
		list.add(new Student01("Akruti",94));
		list.add(new Student01("Chetana",73));
		list.add(new Student01("Bhavana",25));
		list.add(new Student01("Falguni",63));
		list.add(new Student01("Dhruvi",55));
		list.add(new Student01("Monika",44));
	}

}
public class PrediFunConStudent08{
	public static void main(String[] args) {

		ArrayList<Student01> list = new ArrayList<>();
		Student02.populate(list);

		Predicate<Student01> p = s -> s.marks>=60;

		Function<Student01,String> f = s -> {
			int marks = s.marks;
			if(marks>=80){
				return "A[Dictinction]";
			}else if (marks>=60) {
				return "B[First Class]";
			}else if (marks>=50) {
				return "C[Second Class]";
			}else if (marks>=35) {
				return "D[Third Class]";
			}else{
				return "Failed";
			}
		};

		Consumer<Student01> c = s -> {
				System.out.println("Student Name: "+s.name);
				System.out.println("Student Marks: "+s.marks);
				System.out.println("Student Grade: "+f.apply(s));
				System.out.println();
		}; 

		for (Student01 s :list ) {
		
				c.accept(s);
				// System.out.println(s.name);
				// System.out.println(s.marks);
				// System.out.println(f.apply(s));
				// System.out.println();
			
		}

	}
}