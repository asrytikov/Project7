import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        HashSet<String> states = new HashSet<>();
        //HashSet<String> strings = new HashSet<>(32, 0.7f);
        states.add("Germany");
        states.add("Italy");
        states.add("Russia");

        boolean isAdd = states.add("Russia");
        System.out.println(isAdd);

        for (String state:states) {
            System.out.println(state);
        }

        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Ivan"));
        people.add(new Person("Masha"));
        people.add(new Person("Alex"));
        people.add(new Person("Ivan"));

        for (Person person: people) {
            System.out.println(person.getName());
        }

    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}