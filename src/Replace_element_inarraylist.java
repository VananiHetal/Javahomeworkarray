import java.util.ArrayList;

public class Replace_element_inarraylist {

   // WAP to replace a particular element in an ArrayList with the given element


 public static void main(String[] args) {
    //create an ArrayList object
    ArrayList arrayList = new ArrayList();

    // Arraylist
     arrayList.add("10");
     arrayList.add("12");
    arrayList.add("25");


    //  To replace an element at the specified index of ArrayList use
    //  Object set(int index, Object obj) method.
    //  This method replaces the specified element at the specified index in the
    //  ArrayList and returns the element previously at the specified position.

    arrayList.set(1,"REPLACED ELEMENT");

    System.out.println("ArrayList contains...");
    //display elements of ArrayList

    for(int index = 0; index < arrayList.size(); index++)

        System.out.println(arrayList.get(index));

}}

