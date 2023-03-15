import java.util.Arrays;
import java.util.Scanner;

public class Lab03_Task3 {

    public static void main(String[] args) {

        int[] array = {3,9,8,4,10,12,14,6,-3};

        System.out.println(Arrays.toString(array));

        combSort(array);
        System.out.println("\nSorted array : \n"+Arrays.toString(array));

    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }

    public static void combSort(int[] array) {

        int gap = (int) (array.length/ 1.3);

        while (gap >= 1) {
            for (int i = 0; i < array.length - gap; i++) {
                int j = i + gap;
                while (j < array.length) {
                    if (array[i] > array[j]) {
                        swap(array, i, j);
                        System.out.println("Swapped " + array[i] + " & " + array[j]);
                    }
                    j += gap;
                }
            }
            gap = (int) (gap / 1.3);
        }

    }
}
