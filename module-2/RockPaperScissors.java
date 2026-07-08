import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        // Create Scanner and Random objects
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Computer randomly chooses 1, 2, or 3
        int computer = random.nextInt(3) + 1;

        // Prompt user
        System.out.print("\nPlease enter (1 = Rock, 2 = Paper, 3 = Scissors): \n\n");
        int user = input.nextInt();

        if (user < 1 || user > 3) {
        System.out.println("\nInvalid choice. Program ending.");
        input.close();
        return;
        }

        // Convert numbers to words (see switch method below)
        String cPick = convertChoice(computer);
        String uPick = convertChoice(user);

        // Display choices
        System.out.println("\nComputer: " + cPick + "\n");
        System.out.println("You: " + uPick + "\n");

        // Determine winner
        if (computer == user) {
            System.out.println("Tie!");
        }
        else if (
                (user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2)
        ) {
            System.out.println("You win!\n");
        } 
        else {
            System.out.println("Computer wins!\n");
        }

        input.close();
    }

    // Switch method to convert number to text
    public static String convertChoice(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
}
