package functional_inter_primitive;

import java.util.function.*;

class PrimitiveConsumer{
	public static void main(String[] args) {
		
		IntConsumer c = i ->System.out.println("The Squere of i: "+(i*i));
		c.accept(10);
		c.accept(22);
		System.out.println();
		
	}
}