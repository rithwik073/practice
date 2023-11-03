package groupingandcomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", 3));
        students.add(new Student("Bhavesh", 2));
        students.add(new Student("Chandani", 1));
        students.add(new Student("Divya", 4));

        // Sort students by name using a custom Comparator
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Collections.sort(students, nameComparator);

        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " (ID: " + student.getId() + ")");
        }

        // Sort students by ID using another custom Comparator
        Comparator<Student> idComparator = Comparator.comparing(Student::getId);
        Collections.sort(students, idComparator);

        System.out.println("\nSorted by ID:");
        for (Student student : students) {
            System.out.println(student.getName() + " (ID: " + student.getId() + ")");
        }
    }
}
