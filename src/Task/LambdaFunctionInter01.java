package Task;//- Write a program for Lambda with implementing functional Interface.

@FunctionalInterface
interface interf{

	public void m1();
}
public class LambdaFunctionInter01{
	public static void main(String[] args) {
		
		interf I = () -> System.out.println("This is FunctionalInterface abstract method");
		I.m1();
	}
}