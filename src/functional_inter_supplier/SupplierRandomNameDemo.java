package functional_inter_supplier;

import java.util.function.Supplier;

public class SupplierRandomNameDemo{
	public static void main(String[] args) {
		
		Supplier<String> s = () ->{
					String[] s1={"Sunny","Banti","Babli","Montu","Chintu"};
					int x = (int)(Math.random()*5);
					return s1[x];
				};
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());	
	}
}