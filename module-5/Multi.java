import java.util.Arrays;

public class Multi {
    // Methods to locate largest and smallest elements of 2D arrays
    public static int [ ] locateLargest (double[][] arrayParam) {
        double largest = arrayParam[0][0];
        int locationArray[] = new int[]{0, 0};

        for (int i = 0; i < arrayParam.length; i++) {
            for(int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    locationArray[0] = i;
                    locationArray[1] = j;
                }
            }
        }
        return locationArray;
    }
    public static int [ ] locateLargest (int[][] arrayParam) {
        int largest = arrayParam[0][0];
        int locationArray[] = new int[]{0, 0};

        for (int i = 0; i < arrayParam.length; i++) {
            for(int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    locationArray[0] = i;
                    locationArray[1] = j;
                }
            }
        }
        return locationArray;
    }
        public static int [ ] locateSmallest (double[][] arrayParam) {
        double smallest = arrayParam[0][0];
        int locationArray[] = new int[]{0, 0};

        for (int i = 0; i < arrayParam.length; i++) {
            for(int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    locationArray[0] = i;
                    locationArray[1] = j;
                }
            }
        }
        return locationArray;
    }
    public static void main (String[] args) {
        double[][] doubArray = { {(10.1), (20.2), (35550.3)},
								 {(0.1), (5550.5), (60.6)},
                                 {(80.2), (80.1), (1.1)}
							   };
        int[] doubLocationLg = locateLargest(doubArray);
        System.out.println("The location of the largest double array element is: " + Arrays.toString(doubLocationLg));

        double[][] intArray = { {(10), (20), (550)},
								{(.1), (550), (6970)},
                                {(80), (80090), (1)}
							  };
        int[] intLocationLg = locateLargest(intArray);
        System.out.println("The location of the largest int array element is: " + Arrays.toString(intLocationLg));

        int[] doubLocationSm = locateSmallest(doubArray);
        System.out.println("The location of the smallest double array element is: " + Arrays.toString(doubLocationSm));

        int[] intLocationSm = locateSmallest(intArray);
        System.out.println("The location of the smallest int array element is: " + Arrays.toString(intLocationSm));
    }
}