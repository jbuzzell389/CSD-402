import java.util.ArrayList;
import java.util.Scanner;

public class Colors {

    public static void main(String[] args) {

        // Create an ArrayList filled with 10 Strings
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Brown");

        // Print the ArrayList using a for-each loop
        System.out.println("ArrayList Contents:\n");

        for (String color : colors) {
            System.out.println(color);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nWhich element (0-9) would you like to see again? ");

        // User input exhibits auto-unboxing
        Integer index = input.nextInt();

        try {
            System.out.println("\nElement: " + colors.get(index));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }

        input.close();
    }
}
