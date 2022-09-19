package functional_interface.task;

@FunctionalInterface
interface I1{

	public void m4();
	default void m5(){
		System.out.println("This is interface default Method M5()");
	}
	static void m6(){
		System.out.println("This is interface static Method M6()");	
	}
}

class Demo2 implements I1{

	public void m4(){
		System.out.println("This is interface Method M4()");
	}
}


public class FunctionalInterDemo{
	public static void main(String[] args) {
		
		I1.m6();
		Demo2 d1 = new Demo2();
		d1.m4();	
		d1.m5();
	}
}