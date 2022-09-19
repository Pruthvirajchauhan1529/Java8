package lambda_expression_with_collection;

interface InterF{
	public void m1();
}


public class AnonymousLambdaInnerDemo{
	int x= 888;
	public void m2(){
		InterF i = () -> {
			int x =999;
			System.out.println(this.x);
		};
		i.m1();
	}

	public static void main(String[] args) {
		
		AnonymousLambdaInnerDemo a = new AnonymousLambdaInnerDemo();
		a.m2();
	}
}