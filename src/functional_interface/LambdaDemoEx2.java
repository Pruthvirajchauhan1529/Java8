package functional_interface;

interface inter6{
	public void add(int a, int b);
}
public class LambdaDemoEx2{
	public static void main(String[] args) {
	
		inter6 i = (a,b) -> System.out.println("The sum by the Lambda Expresion implements: "+(a+b));
		i.add(20,30);
		i.add(300,200); 

	}
}