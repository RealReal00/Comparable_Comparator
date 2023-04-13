import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Main {


    public static void main(String[] args) {
        ArrayList<Person> l = new ArrayList<Person>();
        l.add(new Person("AMario", "Rossi", 68));
        l.add(new Person("Luca", "Bianchi", 28));
        l.add(new Person("Carlo", "Antoni", 34));
        // natural ordering (Comparable)
        Collections.sort(l);
        System.out.println(l.toString());
        // special ordering (Comparator)
        Collections.sort(l, new SortByAge());
        System.out.println(l.toString());
        // Comparator concise form
        Collections.sort(l, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

    }
}
