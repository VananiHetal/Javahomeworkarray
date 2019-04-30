import java.util.Arrays;

public class Equality_twoArrays {

   // Write a Java program to test the equality of two arrays.
    // main method}

public static void main(String []args){
    int[] a1 = new int[]{30,40,50,60}; // a1= array1
    int[] a2 = new int[]{30,40,50,60};  // a2 = array2
    int[] a3 = new int[]{40,60,70,80};   // a3 = array3

    System.out.println("a1 equals to a2 : " + Arrays.equals(a1,a2));

    System.out.println("is a1 equals to a3: " + Arrays.equals(a1,a3));

}
}





