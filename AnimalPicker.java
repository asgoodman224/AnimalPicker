import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String userInput;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Which animal would you like to see: a dog, a cat, or a fish?");
            System.out.print("Enter your choice: ");
            userInput = scanner.nextLine().toLowerCase();
            
            if (userInput.equals("dog")) {
                System.out.println("DOG ASCII ART HERE");
                isValidInput = true;
            } else if (userInput.equals("cat")) {
                System.out.println("CAT ASCII ART HERE");
                isValidInput = true;
            } else {
                System.out.println("Invalid option. Please choose between dog or cat");
            }
        }
        
        scanner.close();
    }
}


