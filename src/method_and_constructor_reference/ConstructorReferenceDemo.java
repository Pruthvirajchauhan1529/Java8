package method_and_constructor_reference;

class Sample{
	public Sample(){
		System.out.println("Sample clas constructor execution and Object creation: ");
	}
}
interface interf{
	public Sample get();
}
public class ConstructorReferenceDemo{

	public static void main(String[] args) {
		
		interf i = Sample :: new;	
		Sample s = i.get();
	}
}