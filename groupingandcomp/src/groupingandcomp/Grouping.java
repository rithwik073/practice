package groupingandcomp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        // Sample list of Person objects
        List<Person> people = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("rithwik", 25),
            new Person("jagadees", 30),
            new Person("adam", 35)
        );

        // Group people by their age
        Map<Integer, List<Person>> groupedByAge = people.stream()
            .collect(Collectors.groupingBy(Person::getAge));

       
        groupedByAge.forEach((age, persons) -> {
            System.out.println("People aged " + age + ":");
            persons.forEach(person -> System.out.println("  " + person.getName()));
        });
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}