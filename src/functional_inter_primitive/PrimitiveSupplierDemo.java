package functional_inter_primitive;

import java.util.function.*;

public class PrimitiveSupplierDemo{
	public static void main(String[] args) {

		IntSupplier s = ()->(int)(Math.random()*10);		
		String otp ="";
		for (int i=1; i<=6; i++) {
			otp = otp + s.getAsInt();
		}
		System.out.println("The 6 digit OTP: "+otp);
	}
}