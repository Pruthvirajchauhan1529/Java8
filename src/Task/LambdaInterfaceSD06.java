package Task;//- Write a program for functional Interface with static and default method and use static and default
//methods.

@FunctionalInterface
interface inter9{
	public void m1();
	default void m2(){
		System.out.println("This is interface default method");
	}
	static void m3(){
		System.out.println("This is interface static method");
	}
}

class LambdaInterfaceSD06 implements inter9{
	
	public void m1(){
			System.out.println("This is interface main method");
	}
	public static void main(String[] args) {

		LambdaInterfaceSD06 li = new LambdaInterfaceSD06();
		li.m1();
		li.m2();
		inter9.m3();
	}
}	