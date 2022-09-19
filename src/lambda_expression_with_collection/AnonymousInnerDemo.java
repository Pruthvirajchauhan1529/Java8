package lambda_expression_with_collection;

interface Interf{

	public void m1();
}

public class AnonymousInnerDemo{
		
	int x = 888;
	public void m2(){
		Interf i = new Interf(){
			int x = 999;
			public void m1(){
				System.out.println(this.x);
			}
		};
		i.m1();
	}
	public static void main(String[] args) {
		 
		 AnonymousInnerDemo a = new AnonymousInnerDemo();
		 a.m2();
	}
}