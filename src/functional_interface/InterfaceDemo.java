package functional_interface;

interface Inter3{
	public int m1(int i);
	public int m2(int i);
}
public class InterfaceDemo{
	public static void main(String[] args) {

		Inter3 I = i -> i*i;
		System.out.println(I.m1(5));
	}

}