import java.util.Scanner;

public class Sort_Values_AscendingOrder {

   // WAP to enter array and sort the values in ascending order

    //main method

    public static void main(String []args) {

        // initialize array
        int[]a= new int[]{8,4,7,5,9};
         int temp = 0;
         //display values of original array
        System.out.println(" Value of original array :");

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]+ "");
        }
        // sorting values in ascending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //display values of array after sorting
        System.out.println("Ascending Order:");
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]+ "");
        }
    }
    }













