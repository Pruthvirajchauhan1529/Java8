package functional_inter_consumer;

import java.util.ArrayList;

class Students{

	String name;
	int marks;
	public Students(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	public String toString(){
		return "Student Name: "+name+" Student Marks: "+marks;
	}
}
