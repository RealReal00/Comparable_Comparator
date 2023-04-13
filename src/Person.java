public class Person implements Comparable<Person>{
    protected String name;
    protected String lastname;
    protected int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public int compareTo(Person p) {
        return lastname.compareTo(p.name);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + ", age=" + age + '}';
    }
}
