/* James Buzzell
   08/05/2026
   CSD-402 Assignment 8.2 */

import java.util.ArrayList;
import java.util.Scanner;

public class JamesArrayListTest {

    // Method that returns largest integer in ArrayList
    public static Integer max(ArrayList<Integer> theList) {

        // Return 0 if the ArrayList is empty
        if (theList == null || theList.isEmpty()) {
            return 0;
        }

        Integer large = theList.get(0);

        for (Integer num : theList) {
            if (num > large) {
                large = num;
            }
        }

        return large;
    }

    public static void main(String[] myArg) {

        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter integers (hit 0 to stop):");

        int val;

        do {
            System.out.print("Please enter an integer: ");
            val = userInput.nextInt();
            nums.add(val);
        } while (val != 0);

        Integer large = max(nums);

        System.out.println("\nIntegers entered: " + nums);
        System.out.println("Largest one: " + large);

        userInput.close();
    }
}