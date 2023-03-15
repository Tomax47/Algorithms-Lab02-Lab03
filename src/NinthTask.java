import java.util.Random;

public class NinthTask {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-10,10);
            System.out.print(array[i]+" ");
        }

        System.out.println("\n");
        sortArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void sortLeftHalf(int[] array) {
        for (int i = 0; i < array.length / 2 - 1; i++) {
            for (int j = 0; j < array.length / 2 - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
    }

    public static void sortRightHalf(int[] array) {
        for (int i = array.length / 2; i < array.length - 1; i++) {
            for (int j = array.length / 2; j < array.length - i - 1 + array.length / 2; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
    }
    public static void sortArray(int[] array) {
        sortRightHalf(array);
        sortLeftHalf(array);
    }


}
