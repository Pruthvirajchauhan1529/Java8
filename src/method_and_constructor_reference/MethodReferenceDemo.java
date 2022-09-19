package method_and_constructor_reference;

interface intrtf{
	public void m1();
}

public class MethodReferenceDemo{
	public static void main(String[] args) {
		
		intrtf i = MethodReferenceDemo :: m2;

		i.m1();
	}
	public static void m2(){
		System.out.println("Method Reference: ");
		System.out.println("Method Reference: ");
		System.out.println("Method Reference: ");
		System.out.println("Method Reference: ");
		System.out.println("Method Reference: ");
	}
 }