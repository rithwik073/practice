package list;

public class StringfunctionDemo {
    public static void main(String[] args) {
        // Different sample strings for string functions demonstration
        String text = "Hello, World! This is a Java string example.";
        String anotherText = " Welcome to string operations in Java programming.";
        String sentence = "Java is a versatile programming language.";
        String replacedText = "This is a sample text for replace demonstration.";

        // Length of the string
        int length = text.length();
        System.out.println("Length of the string: " + length);

        // Concatenation
        String combinedText = text.concat(anotherText);
        System.out.println("Concatenated string: " + combinedText);

        // Substring
        String substring = sentence.substring(0, 10);
        System.out.println("Substring: " + substring);

        // Uppercase and lowercase
        String uppercaseText = sentence.toUpperCase();
        String lowercaseText = sentence.toLowerCase();
        System.out.println("Uppercase: " + uppercaseText);
        System.out.println("Lowercase: " + lowercaseText);

        // Replace
        String newReplacedText = replacedText.replace("sample", "example");
        System.out.println("Replaced string: " + newReplacedText);

        // Split
        String[] words = sentence.split(" "); // Split the string into an array of words
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        // Check if a string contains a substring
        String searchWord = "versatile";
        if (sentence.contains(searchWord)) {
            System.out.println("The string contains '" + searchWord + "'");
        } else {
            System.out.println("The string does not contain '" + searchWord + "'");
        }

        // Check if a string starts with or ends with a specific prefix/suffix
        String prefix = "Java is";
        String suffix = "programming language.";
        boolean startsWithPrefix = sentence.startsWith(prefix);
        boolean endsWithSuffix = sentence.endsWith(suffix);
        System.out.println("Starts with '" + prefix + "': " + startsWithPrefix);
        System.out.println("Ends with '" + suffix + "': " + endsWithSuffix);

        // Index of a character or substring
        int indexOfExclamation = text.indexOf("!");
        int indexOfVersatile = sentence.indexOf("versatile");
        System.out.println("Index of '!' character: " + indexOfExclamation);
        System.out.println("Index of 'versatile' substring: " + indexOfVersatile);
    }
}
