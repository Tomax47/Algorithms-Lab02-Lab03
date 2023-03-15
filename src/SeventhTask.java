import com.sun.security.jgss.GSSUtil;

import java.util.Random;

public class SeventhTask {
    public static void main(String[] args) {
        Random rnd = new Random();

//        int[][] array = new int[6][4];
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 4; j++) {
//                array[i][j] = rnd.nextInt(-10,10);
//            }
//        }

        int[][] array = { { 45, 23, 56}, { 1, 3, 2}, {-3, 4, -7}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        sortColumns(array);

        System.out.println("\n");
        int numberOfSwitches = numOfSwitches(array);
        System.out.println("The number of switches for the 2-Dimensional array : "+numberOfSwitches);


        //ONE DIMENSIONAL ARRAY
        int[] arrays = {9,8,6,7,2,1};
        System.out.println("\n");
        int numbOfSwitches = numbOfSwitchesOne(arrays);
        //Sorted
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
        System.out.println("\nThe number of switches for the 1-Dimensional array is : "+numbOfSwitches);


    }

    public static void sort(int[][] array, int index) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i][index];
            int j = i - 1;
            while (j >= 0 && array[j][index] > key) {
                array[j+1][index] = array[j][index];
                j--;
            }
            array[j+1][index] = key;
        }
    }


    public static void sortColumns(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        for (int j = 0; j < m; j++) {
            sort(array, j);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int numOfSwitches(int[][] array) {
        int switches = 0;
        for (int[] row : array) {
            for (int i = 1; i < row.length; i++) {
                int a = row[i];
                int j = i - 1;
                while (j >= 0 && row[j] < a) {
                    row[j + 1] = row[j];
                    j--;
                    switches++;
                }
                row[j + 1] = a;
            }
        }
        return switches;
    }

    public static int numbOfSwitchesOne(int[] array) {
        int[] original = array.clone();
        int switches = 0;
        for (int i = 1; i < array.length; i++) {
            int a = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < a) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = a;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != original[i]) {
                switches++;
            }
        }
        return switches;
    }

}
