package functional_interface;

interface inter5{
	public void add(int a, int b);
}
class Demo1 implements inter5{

	public void add(int a, int b){
		System.out.println("The sum by Normal implements: "+(a+b));
	}
}

public class LambdaDemoEx1{
	public static void main(String[] args) {
	
		inter5 i = new Demo1();

		i.add(20,30);
		i.add(100,200);		
	}
}