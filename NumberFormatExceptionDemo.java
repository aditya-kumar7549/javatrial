import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String userInput = scanner.nextLine();
        try {
            int number = Integer.parseInt(userInput);
            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + userInput + "\" is not a valid number");
        } finally {
            scanner.close();
        }
    }
}
