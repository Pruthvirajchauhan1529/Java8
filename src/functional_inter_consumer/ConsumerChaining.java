package functional_inter_consumer;

import java.util.function.Consumer;

public class ConsumerChaining{
	public static void main(String[] args) {
		
		Consumer<MovieForConsumer> c1 = m -> System.out.println("Movie Name: "+m.name+" is ready to release");

		Consumer<MovieForConsumer> c2 = m-> System.out.println("Movie Name: "+m.name+" is just release and it is: "+m.result);

		Consumer<MovieForConsumer> c3 = m -> System.out.println("Movie Name: "+m.name+" information storing in databased");

		Consumer<MovieForConsumer> chainedC = c1.andThen(c2).andThen(c3);

		MovieForConsumer m1 = new MovieForConsumer("Bahubali", "hit");
		chainedC.accept(m1);
		System.out.print("\n");
		MovieForConsumer m2 = new MovieForConsumer("Spider", "Flop");
		chainedC.accept(m2);

	}
}