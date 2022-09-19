package fun_inter_two_argument;

import java.util.function.*;

public class BiConsumerDemo{
	public static void main(String[] args) {
		BiConsumer<String,String> c = (s1,s2)-> System.out.println(s1+s2);
		c.accept("Pruthviraj","Chauhan");
	}
}