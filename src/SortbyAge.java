import java.util.Comparator;

class SortByAge implements Comparator<Person> {
    int val;
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}
