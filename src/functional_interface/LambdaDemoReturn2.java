package functional_interface;

interface interf{

	public int getLength(String s);
}

public class LambdaDemoReturn2{
	public static void main(String[] args) {
		
		interf i = s -> s.length();
		System.out.println(i.getLength("Hello Java"));
		System.out.println(i.getLength("With Lambda Expression implements"));
	}
}