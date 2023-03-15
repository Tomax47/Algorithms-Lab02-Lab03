import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-20,20);
            System.out.print(array[i]+" ");
        }


        System.out.println();
        sortTheArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }


    public static int[] sortTheArray(int[] array) {
        int index=0;
        //Here we make (i < array.length -1) we add the -1 cuz the last element after sorting whether we check it or not there aint gonna b a place except for its place so no need to check for it
        for (int i = 0; i < array.length -1 ; i++) {
            index = IndexOfSmallest(array,i, array.length - 1);
            int min = array[index];
            array[index] = array[i];
            array[i] = min;
          //System.out.println("Smallest " + index);
        }

        return array;
    }

    public static int IndexOfSmallest(int[] array, int a, int b) {
        int index = a;
        for (int i = a +1; i <= b; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}

