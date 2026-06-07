import java.util.Scanner;

public class WaterHeatingEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for amount of water, initial temp, and final temp
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemperature = input.nextDouble();

        // Calculate energy using formula
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Output result
        System.out.println("The energy needed is " + energy + " Joules.");

        input.close();
    }
}
