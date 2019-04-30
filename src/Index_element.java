public class Index_element {

    //WAP to find the index of of element

    //main method

    public static int findIndex(int a1[], int t) {   //a1 = array

        // ls if array null
        if (a1 == null) {

            return -1;
        }
        // find length of array
        int len = a1.length;
        int i = 0;
        // traverse in the array
        while (i < len) {
            // if the i-th element is t
            // then return the index
            if (a1[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    /// Driver Code
    public static void main(String[] args) {
        int[] a1 = {52, 53, 86, 92, 72,};

        // find the index of 86
        System.out.println("Index position of 86 is: " + findIndex(a1, 86));

    }
}