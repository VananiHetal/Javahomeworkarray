import java.util.ArrayList;

public class Clone_Arraylist1 {

//Write a Java program to clone an array list to another array list.
// MAIN METHOD
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("MAYA");
        c1.add("NAYA");
        c1.add("PETER");
        c1.add("DAVID");
        c1.add("GEORGE");
        System.out.println("Original array list: " + c1);
        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("Cloned array list: " + newc1);
    }







}

