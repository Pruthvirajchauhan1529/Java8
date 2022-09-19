package fun_inter_two_argument;

import java.util.ArrayList;
import java.util.function.*;
import java.util.Collections;

class Student{
	String name;
	int rollno;
	public Student(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	public String getName(){
		return name;
	}
	public void setRollNo(int rollno){
		this.rollno = rollno;
	}

	public String toString(){
		return name+" "+rollno;
	}
}

public class BiFunctionObjStdDemo{
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		BiFunction<String,Integer,Student> f = (name, rollno) -> new Student(name, rollno);
		list.add(f.apply("Kalpesh",10));
		list.add(f.apply("Nilesh",20));
		list.add(f.apply("Mayank",30));
		list.add(f.apply("Hitesh",40));
		list.add(f.apply("Bhavik",50));

		Collections.sort(list, (s1,s2)-> s1.getName().compareTo(s2.getName()));

		for (Student s : list ) {
			System.out.println("Student Name: "+s.name);
			System.out.println("Student RollNo: "+s.rollno);
			System.out.println();
		}
	}
}