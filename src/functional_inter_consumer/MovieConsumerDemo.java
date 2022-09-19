package functional_inter_consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class MovieForConsumer {
	String name;
	String hero;
	String heroine;

	public MovieForConsumer(String name, String hero, String heroine){
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
	public String toString(){
		return "Movie Name: "+name+" Hero Name: "+hero+" Heroine Name: "+heroine;
	}
}

public class MovieConsumerDemo{
	public static void main(String[] args) {

		ArrayList<MovieForConsumer> list = new ArrayList<>();
		Movies.populate(list);

		Consumer<MovieForConsumer> c = m -> {
					System.out.println("Movie Name: "+m.name);
					System.out.println("Hero Name: "+m.hero);
					System.out.println("Heroine Name: "+m.heroine);
					System.out.println();
				};

		for (MovieForConsumer m : list) {
			c.accept(m);
		}
	}
}