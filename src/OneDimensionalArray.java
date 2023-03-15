import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



//                                         LAB-03 FIRST TASK
public class OneDimensionalArray {

    private double[] array;


    public OneDimensionalArray(){
        array = null;
    };

    public OneDimensionalArray(int size) {
        this.array = new double[size];
    }

    public OneDimensionalArray(double[] array) {
        this.array = array;
    }

    public void fillArray(){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a real value to x : ");
            array[i] = scan.nextDouble();
        }

    }

    public void autoFill(double a, double b){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextDouble(a,b);
        }
    }

    public String printArray(){
        return Arrays.toString(array);
    }


    public double getElement(int index) {
        return array[index];
    }

    public void setArrayElement(double x, int index) {
        array[index] = x;
    }

    public double sumOfElements() {
        double sum=0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }


    public double largestElement() {
        double largest = -1.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }

    public int indexOfSmallest() {
        int index = 0;
        double smallest = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    public int length() {
        return array.length;
    }

}

