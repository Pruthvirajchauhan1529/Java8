package functional_inter_consumer;

import java.util.ArrayList;

class StudentList {

    public static void populate(ArrayList<Students> list) {
        list.add(new Students("Akruti", 94));
        list.add(new Students("Chetana", 73));
        list.add(new Students("Bhavana", 25));
        list.add(new Students("Falguni", 63));
        list.add(new Students("Dhruvi", 55));
        list.add(new Students("Monika", 44));
    }
}
