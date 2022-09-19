package functional_interface;

interface inter1{
	public void m1();
}

class Demo implements inter1{
	public void m1(){
		System.out.println("M1() method implements");
	}
}

public class LambdaDemo{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
	}
}