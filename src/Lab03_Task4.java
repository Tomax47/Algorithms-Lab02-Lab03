import java.sql.SQLOutput;
import java.util.Arrays;

public class Lab03_Task4 {

    public static void main(String[] args) {

        int[] array = {3,9,8,4,10,12,14,6,-3};

        System.out.println(Arrays.toString(array));

        quickSort(array,0, array.length - 1);
        System.out.println("\nSorted array : \n"+Arrays.toString(array));

    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {

        while (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && rightPointer > leftPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
            System.out.println("\nSwapped "+leftPointer+" & "+rightPointer);
        }

        swap(array, leftPointer, highIndex);
        System.out.println("\nPivot has been swapped!\n");

        quickSort(array, lowIndex, leftPointer -1);
        quickSort(array, leftPointer + 1, highIndex);
    }
}
