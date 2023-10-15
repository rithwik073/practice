package list;
import java.util.Arrays;
import java.util.List;

public class FeatureDemo {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Streams and Lambda functions to perform operations on the list
        System.out.println("Original List: " + numbers);

        // Filter even numbers and print them
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        System.out.println("Even Numbers: " + evenNumbers);

        // Double each number and print the result
        List<Integer> doubledNumbers = numbers.stream()
                .map(num -> num * 2)
                .toList();
        System.out.println("Doubled Numbers: " + doubledNumbers);

        // Sum all the numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Numbers: " + sum);

        // Find the maximum number
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Maximum Number: " + max);
    }
}

