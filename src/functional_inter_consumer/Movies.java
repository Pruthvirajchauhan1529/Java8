package functional_inter_consumer;

import java.util.ArrayList;


class Movies{

	public static void populate(ArrayList<MovieForConsumer> list){
		list.add(new MovieForConsumer("Bahubali","Prabhash","Anushka"));
		list.add(new MovieForConsumer("Rayeesh","Sharukh","Sunny"));
		list.add(new MovieForConsumer("Dangal","Amir","Ritu"));
		list.add(new MovieForConsumer("Sultan","Salman","Anushka"));
		list.add(new MovieForConsumer("Ram-Lila","Ranavir","Deepika"));
	}
}