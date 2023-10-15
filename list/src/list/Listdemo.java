package list;

import java.util.ArrayList;
import java.util.List;

public class Listdemo {
    public static void main(String[] args) {
        // Creating a new ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the list
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(30);

        // Accessing elements in the list
        System.out.println("Elements in the list:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Updating an element
        numbers.set(1, 12); // Replacing the second element (index 1) with 12

        // Removing an element
        numbers.remove(2); // Removing the third element (index 2)

        System.out.println("\nUpdated elements in the list:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Checking if the list contains a specific element
        int searchValue = 15;
        if (numbers.contains(searchValue)) {
            System.out.println("\nThe list contains " + searchValue);
        } else {
            System.out.println("\nThe list does not contain " + searchValue);
        }

        // Getting the size of the list
        System.out.println("\nSize of the list: " + numbers.size());

        // Clearing the list
        numbers.clear();
        System.out.println("List cleared. Size is now: " + numbers.size());
    }
}


