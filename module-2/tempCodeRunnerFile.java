public class PowerPyramid {

    public static void main(String[] args) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            // Print leading spaces
            for (int space = rows - i - 1; space > 0; space--) {
                System.out.print("  ");
            }

            // Print ascending powers of 2
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number *= 2;
            }

            // Print descending powers of 2
            number /= 4;
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number /= 2;
            }

            // Print the @ symbol
            System.out.println("@");
        }
    }
}
