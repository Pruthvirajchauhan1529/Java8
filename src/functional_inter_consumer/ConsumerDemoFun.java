package functional_inter_consumer;

import java.util.function.Consumer;

public class ConsumerDemoFun{
	public static void main(String[] args) {
		
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Pruthviraj");
		c.accept("Chauhan");
	}
}