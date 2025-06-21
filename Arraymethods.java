public class Arraymethods {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements
        System.out.println("First element: " + numbers[0]);

        // Length of the array
        System.out.println("Length of array: " + numbers.length);

        // Looping through the array
        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Modifying an element
        numbers[2] = 10; // Change third element to 10
        System.out.println("Modified third element: " + numbers[2]);

        // Copying an array
        int[] copiedArray = java.util.Arrays.copyOf(numbers, numbers.length);
        System.out.print("Copied array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
