import java.util.Random;

public class ArrayOddEvenSorting {

    public static void main(String[] args) {
        Random rnd = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-10,10);
        }

    }

    public static void oddEvenSort(double[] array) {
        for (int i = 0; i < array.length; i += 2) { // for each even index i
            int minIndex = i;
            for (int j = i + 2; j < array.length; j += 2) { // find the minimum element among the remaining even indices
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) { // if the minimum element is not at index i, swap the elements at indices i and minIndex
                double temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        for (int i = 1; i < array.length; i += 2) { // for each odd index i
            int maxIndex = i;
            for (int j = i + 2; j < array.length; j += 2) { // find the maximum element among the remaining even indices
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) { // if the maximum element is not at index i, swap the elements at indices i and maxIndex
                double temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
    }
}
