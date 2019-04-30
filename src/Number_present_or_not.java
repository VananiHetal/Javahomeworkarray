import java.util.ArrayList;
import java.util.List;

public class Number_present_or_not {

    //WAP to check whether the given element is present in an ArrayList or not?
// main method

    public static void main(String[] args) {
        List aList = new ArrayList();
        aList.add("15");
        aList.add("19");
        aList.add("88");
        aList.add("66");
        aList.add("10");
        System.out.println("The number 88 is present in ArrayList? " + aList.contains("88"));
        System.out.println("The number 10 is present in ArrayList? " + aList.contains("10"));
    }}