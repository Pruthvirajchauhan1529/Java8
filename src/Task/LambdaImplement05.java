package Task;//"- Write a program for functional Interface and implement it using lambda.

@FunctionalInterface
interface inter8{
	public void add(int a,int b);
}

class LambdaImplement05{
	public static void main(String[] args) {
		inter8 f = (a,b) ->{ System.out.println("Addision of two Number: "+(a+b));
		};
		f.add(20,30);
	}
}