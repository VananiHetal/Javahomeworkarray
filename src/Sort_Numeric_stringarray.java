import java.util.Arrays;
import java.util.SortedMap;

public class Sort_Numeric_stringarray {

    //WAP to sort a numeric array and a string array.

    // main method

    public static void main(String[] args) {

        //   m1= int values
        int[] m1 = {35, 41, 85, 16, 79, 50};

        // string values
        String[] m2 = {"banana", "strawberry", "mango", "apple", "melon"};
        System.out.println(" numeric array :" + Arrays.toString(m1));
        //m1 methpd
        Arrays.sort(m1);
        System.out.println("Sorted numeric array:" + Arrays.toString(m1));
        //m2 string method
        System.out.println("String array:" + Arrays.toString(m2));
        Arrays.sort(m2);

        System.out.println("Sorted array:" + Arrays.toString(m2));

    }
}
