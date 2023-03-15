import java.util.Arrays;
import java.util.Random;

public class Main2{
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-20,20);
            System.out.print(array[i]+" ");
        }

        System.out.println(Arrays.toString(sortTheArray(array)));

    }

    public static int[] sortTheArray(int[] array) {
        int switches = 0;
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int a = array[i];
                array[i] = array[min];
                array[min] = a;
                switches++;
            }
        }
        System.out.println("\nSwitches : "+switches);
        return array;
    }

}
