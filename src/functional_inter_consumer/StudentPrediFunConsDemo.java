package functional_inter_consumer;

import java.util.ArrayList;
import java.util.function.*;

public class StudentPrediFunConsDemo{
	public static void main(String[] args) {
		ArrayList<Students> list = new ArrayList<>();
		StudentList.populate(list);

		Predicate<Students> p = s -> s.marks>=60;

		Function<Students,String> f = s -> {
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

		Consumer<Students> c = s -> {
				System.out.println("Student Name: "+s.name);
				System.out.println("Student Marks: "+s.marks);
				System.out.println("Student Grade: "+f.apply(s));
				System.out.println();
		}; 

		for (Students s :list ) {
		
				c.accept(s);
				// System.out.println(s.name);
				// System.out.println(s.marks);
				// System.out.println(f.apply(s));
				// System.out.println();
			
		}

	}
}