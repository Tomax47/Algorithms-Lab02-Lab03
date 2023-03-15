import java.util.Random;

public class SortingArray2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-10,10);
            System.out.print(array[i]+" ");
        }

        System.out.println();
        sortTheArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println("\n");
        int numberOfSwitches = countSwitches(array);
        System.out.println("Number os switches : "+numberOfSwitches);

    }

    public static int minimumIndex(int[] array, int a, int b) {
        int minIndex = a;
        for (int i = a + 1; i <= b; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void sortTheArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = minimumIndex(array, i, array.length - 1);
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }


    public static int countSwitches(int[] array) {
        int switches = 0;
        int i = 0;
        while (i < array.length - 1) {
            int minIndex = i;
            int j = i + 1;
            while (j < array.length) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                j++;
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                switches++;
            }
            i++;
        }
        return switches;
    }

}
