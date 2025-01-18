import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Example array with 5 elements
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index to access: ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Valid indices are 0 to " + (numbers.length - 1) + ".");
        } finally {
            scanner.close();
        }
    }
}
