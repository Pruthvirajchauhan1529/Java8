package functional_inter_predicate;//Program to check whether SoftwareEngineer is allowed into pub or not by using Predicate?

import java.util.function.Predicate;

class SoftwareEngineer{
	String name;
	int age;
	boolean ishavingGF;

	public SoftwareEngineer(String name, int age, boolean ishavingGF){
		this.name = name;
		this.age = age;
		this.ishavingGF = ishavingGF;
	}

	public String toString(){
		return "Name: "+name+" Age: "+age+" IshavingGF: "+ishavingGF;
	}
}

public class SEPredicatePub{
	public static void main(String[] args) {
		SoftwareEngineer[] list ={ 
									new SoftwareEngineer("Prakash",55,false),
									new SoftwareEngineer("Vishal",25,true),
									new SoftwareEngineer("Ravi",28,true),
									new SoftwareEngineer("Harsh",17,true),
									new SoftwareEngineer("Mohit",26,false)
								 };
		Predicate<SoftwareEngineer> allowed = se -> se.age>=18 && se.ishavingGF == true;
			System.out.println("The allow member into pub are: ");
			for (SoftwareEngineer se : list ) {
				if(allowed.test(se)){
					System.out.println(se);
				}
			}
	}
}