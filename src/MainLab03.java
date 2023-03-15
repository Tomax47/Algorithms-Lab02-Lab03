import java.util.Arrays;
import java.util.Scanner;


//                                         LAB-03 FIRST TASK

public class MainLab03 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        OneDimensionalArray array = new OneDimensionalArray(n);
//
//        array.fillArray();
//        array.printArray();

        System.out.println("\n\nRandomly filled Array :");
        System.out.print("Enter a : ");
        int a = scan.nextInt();
        System.out.print("Enter b > a : ");
        int b = scan.nextInt();
        array.autoFill(a,b);

        System.out.println("\nThe array of elements in the range [a,b] : \n");
        System.out.println(array.printArray());
        System.out.println("Array size = "+array.length());

        System.out.print("\nEnter the index of the element u wanna get : ");
        int index = scan.nextInt();
        System.out.println(array.getElement(index));


        System.out.print("\nEnter the value which you want to replace by in the element of index "+index +" : ");
        double value = scan.nextDouble();
        double oldValue = array.getElement(index);
        array.setArrayElement(value,index);
        System.out.println("The old value = "+oldValue+" | New value = "+array.getElement(index));

        System.out.println("\nThe sum of the array's elements = "+array.sumOfElements());
        System.out.println("\nThe largest element in the array : "+array.largestElement());
        System.out.println("\nThe index of the smallest element in the array is : "+array.indexOfSmallest());

        mergeSort(array);
        System.out.println("\n\nMerge-Sorted array : ");
        System.out.println(array.printArray());
    }

    public static void mergeSort(OneDimensionalArray array) {
        while (array.length() < 2) {
            return;
        }

        int midPoint = array.length() / 2;

        OneDimensionalArray leftArray = new OneDimensionalArray(midPoint);
        OneDimensionalArray rightArray = new OneDimensionalArray(array.length() - midPoint);

        for (int i = 0; i < midPoint; i++) {
            leftArray.setArrayElement(array.getElement(i),i);
        }

        for (int i = midPoint; i < array.length(); i++) {
            rightArray.setArrayElement(array.getElement(i),i - midPoint);
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array,leftArray,rightArray);

    }

    public static void merge(OneDimensionalArray array, OneDimensionalArray leftArr, OneDimensionalArray rArray) {
        int i=0, j=0, k=0;

        while (i < leftArr.length() && j < rArray.length()) {
            if (leftArr.getElement(i) < rArray.getElement(j)) {
                array.setArrayElement(leftArr.getElement(i),k);
                i++;
            } else {
                array.setArrayElement(rArray.getElement(j),k);
                j++;
            }
            k++;
        }

        while (i < leftArr.length()) {
            array.setArrayElement(leftArr.getElement(i),k);
            i++;
            k++;
        }

        while (j < rArray.length()) {
            array.setArrayElement(rArray.getElement(j),k);
            j++;
            k++;
        }
    }
}
