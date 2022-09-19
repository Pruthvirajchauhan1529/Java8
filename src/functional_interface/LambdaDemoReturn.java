package functional_interface;

interface inter7{
	public int getLength(String s);
}
class Demo3 implements inter7{

	public int getLength(String s){
		return s.length();
	}
}

class LambdaDemoReturn{
	public static void main(String[] args) {
		
		inter7 i = new Demo3();
		System.out.println(i.getLength("Hello java"));
		System.out.println(i.getLength("Without Lambda"));
	}
}