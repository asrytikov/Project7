package p2;

import java.util.ArrayDeque;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("Germany");
        states.addFirst("Austria");
        states.push("Russia");
        states.addLast("Great Britain");
        states.add("Italy");

        String sFirst = states.getFirst();
        System.out.println(sFirst);

        String sLast = states.getLast();
        System.out.println(sLast + "\n");

        while (states.peek()!=null){
            System.out.println(states.pop());
        }

        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Ivan"));
        people.addLast(new Person("Masha"));

        for (Person person:people) {
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