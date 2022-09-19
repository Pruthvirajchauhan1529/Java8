package functional_inter_primitive;

import java.util.function.*;

public class BinaryOperatorPrimDemo{
	public static void main(String[] args) {
		
		IntBinaryOperator b = (I1,I2)-> I1+I2;

		System.out.println(b.applyAsInt(20,10));		
	}
}