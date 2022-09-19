package functional_inter_function;

import java.util.ArrayList;
import java.util.function.*;
import java.util.Collections;

class Student{
	String name;
	int marks;

	public Student(String name,int marks){
		this.name = name;
		this.marks = marks;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}

public class FunctionStudentGrad{
	public static void main(String[] args) {
		ArrayList<Student> list =new ArrayList<>();
		populate(list);
		Function<Student,String> f = s ->{
				int marks= s.marks;
				if(marks>=80){
					return "A[Dictinction]";
				}else if (marks>=60) {
					return "B[First class]";
				}else if (marks>=50) {
					return "C[Second class]";
				}else if (marks>=35) {
					return "D[Third Class]";
				}else{
					return "E[Failed]";
				}
		};
		Collections.sort(list, (s1,s2)-> s1.getName().compareTo(s2.getName()));
		Predicate<Student> P = s -> s.marks>=60 ;

		for (Student s : list) {
			if(P.test(s)){
				System.out.println("Student Name: "+s.name);
				System.out.println("Student Marks: "+s.marks);
				System.out.println("Student Grad: "+f.apply(s));
				System.out.println();	
			}
		}
	}
	public static void populate(ArrayList<Student> list){
		list.add(new Student("Akruti",94));
		list.add(new Student("Chetana",73));
		list.add(new Student("Bhavana",25));
		list.add(new Student("Falguni",63));
		list.add(new Student("Dhruvi",55));
		list.add(new Student("Monika",44));

	}
}