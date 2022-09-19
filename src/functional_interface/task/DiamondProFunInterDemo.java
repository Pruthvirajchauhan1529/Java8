package functional_interface.task;

@FunctionalInterface
interface I2{

	public void m1();
	default void m2(){
		System.out.println("This is interface2 default Method M2()");
	}
	static void m3(){
		System.out.println("This is interface2 static Method M3()");
	}
}

@FunctionalInterface
interface I3{

	public void m1();
	default void m2(){
		System.out.println("This is interface3 default Method M2()");
	}
	static void m3(){
		System.out.println("This is interface3 static Method M3()");
	}
}
	
class Demo4 implements I2, I3{
	public void m1(){
		System.out.println("This is interface Method M1()");
	}

	public void m2(){
		I2.super.m2();
		I3.super.m2();	
	}
}
class DiamondProFunInterDemo{
	public static void main(String[] args) {
		
		I2.m3();
		I3.m3();	
		Demo4 d2 = new Demo4();
		d2.m1();
		d2.m2();


	}
}