import java.util.Arrays;

public class Avg {

    // Declare methods to calculate averages of arrays
    public static short average (short []array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        short shortAverage = (short) (sum / array.length);
        return shortAverage;
    }

    public static int average (int []array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int intAverage = (int) (sum / array.length);
        return intAverage;
    }

    public static long average (long []array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        long longAverage = sum / array.length;
        return longAverage;
    } 

    public static double average (double []array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double doubleAverage = sum / array.length;
        return doubleAverage;
    }

    // Invoke methods, display values returned + original array elements
    public static void main (String[] args) {
        short[] shortArr = {30521, 22000, 32065};
        int[] intArr = {2000000000, 846, 25458};
        long[] longArr = {3000000000L, 9988L, 687456L};
        double[] doubleArr = {1.1, 2.2, 3.3};

        short shortResult = Avg.average(shortArr);
        int intResult = Avg.average(intArr);
        long longResult = Avg.average(longArr);
        double doubleResult = Avg.average(doubleArr);

        System.out.println("\nArray 1: " + Arrays.toString(shortArr) + "\n" +
                           "Average: " + shortResult);
        System.out.println("\nArray 2: " + Arrays.toString(intArr) + "\n" +
                           "Average: " + intResult);
        System.out.println("\nArray 3: " + Arrays.toString(longArr) + "\n" +
                           "Average: " + longResult);
        System.out.println("\nArray 4: " + Arrays.toString(doubleArr) + "\n" +
                           "Average: " + doubleResult + "\n");
    }
}
