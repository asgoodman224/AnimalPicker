import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Which animal would you like to see: a dog, a cat, or a fish?");
            System.out.print("Enter your choice: ");
            scanner.nextLine().toLowerCase();
        }
    }
}