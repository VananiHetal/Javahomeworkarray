import java.util.ArrayList;

public class Position_Of_Element {

    //WAP to get the position of a particular element in an ArrayList
    // main method

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        // ARRAY LIST
        al.add("RR");
        al.add("DD");
        al.add("EE");
        al.add("HH");
        al.add("JJ");
        al.add("XX");
        al.add("MM");

        System.out.println("Index of 'RR': "+al.indexOf("RR"));
        System.out.println("Index of 'JJ': "+al.indexOf("JJ"));
        System.out.println("Index of 'XX': "+al.indexOf("XX"));
        System.out.println("Index of 'HH': "+al.indexOf("HH"));
    }}