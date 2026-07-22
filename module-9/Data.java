import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Data {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {

            // Create the file if it does not exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending data...");
            }

            // Append 10 random integers
            FileWriter writer = new FileWriter(file, true);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100); // Numbers 0-99
                writer.write(number + " ");
            }

            writer.write(System.lineSeparator());

            writer.close();

            // Read and print the file contents
            System.out.println("\ndata.file contents:\n");

            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
