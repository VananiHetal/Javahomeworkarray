import java.util.Arrays;
import java.util.HashSet;

public class Common_string_value {

  //  Write a Java program to find the common elements between two arrays (string values).

    // main method

    public static void main(String[] args){

    String[] a1 = {"RAJ","RAM","MAN","SHAN"}; // ARRAY 1

    String[] a2 = {"MAN","RAM", "SHAM","SAR"}; // ARRAY2

    System.out.println("a1 :"+Arrays.toString(a1));
       System.out.println("a2 :"+Arrays.toString(a2));

    HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < a1.length; i++)
    {
        for (int j = 0; j < a2.length; j++)
        {
            if(a1[i].equals(a2[j]))
            {
                set.add(a1[i]);
            }
        }
    }

        System.out.println("Common element : "+(set));
}






    }



