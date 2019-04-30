public class Reverse_array {

    //WAP  to reverse an array of intger values.

    public static void main(String[] args) {
        int[] num = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; // variable of array
        System.out.println("Array before reverse");
        // for loop concept to print all integer values.
        for (int i = 0; i < num.length; i++) {  // for loop anondition
            System.out.println(num[i] + " ");
        }
        for (int i = 0, j = num.length - 1; i < j; i++, j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
        System.out.println("\nArray after reverse:");
        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i] + "");
        }

    }}