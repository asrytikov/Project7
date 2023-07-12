package p3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "Russia");
        states.put(3, "Italy");

        String first = states.get(2);
        System.out.println(first);

        Set<Integer> keys = states.keySet();
        Collection<String> values = states.values();

        System.out.println(keys);
        System.out.println(values);

        states.replace(1, "France");

        System.out.println(states);

        for (Map.Entry<Integer, String> item: states.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("123i654", new Person("Ivan"));
        personMap.put("156a789", new Person("Masha"));
        personMap.put("987r123", new Person("Alex"));

        for (Map.Entry<String, Person> item:personMap.entrySet()) {
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
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