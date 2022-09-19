package functional_interface;

interface inter4{
	public void m1();
}

public class LambdaDemo1{
	public static void main(String[] args) {
		
		inter4 i = ()-> System.out.println("M1 method implements with Lambda Expresion");
		i.m1(); 
	}
}