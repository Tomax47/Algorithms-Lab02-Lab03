import java.util.Arrays;
import java.util.Random;

public class TwoDimenArray {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[][] array = new int[6][4];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = rnd.nextInt(-20,20);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        sortTheColumns(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortTheColumns(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            int[] column = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                column[i] = array[i][j];
            }
            Arrays.sort(column);
            for (int i = 0; i < array.length; i++) {
                array[i][j] = column[i];
            }
        }
    }
}
