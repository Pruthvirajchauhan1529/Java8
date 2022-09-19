package method_and_constructor_reference;

public class MethodReferenceDemo2{
		
	public void m1(){
		for (int i=0; i<10; i++) {
			System.out.println("Child Thread ");
		}
	}
	public static void main(String[] args) {
		
		MethodReferenceDemo2 m = new MethodReferenceDemo2();
		Runnable r = m :: m1;
		Thread t = new Thread(r);
		t.start();
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread ");
		}
	}
}