import java.util.Arrays;

public class Compare_2arraylist {

    //Write a Java program to compare two array lists.
    // main method
    public static void main (String[] args)
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
}

