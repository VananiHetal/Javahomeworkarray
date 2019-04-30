public class Specific_value {

    //WAP to test if an array contains as specific value

    // m1 = array list of number
    //num= specific number to find out

    public static boolean contains(int[] m1, int num) {  //declared boolean method


        for (int n : m1) {

            if (num == n) {

                return true;
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        int[] m2 = { 55,65,75,85,105,95};

        System.out.println(contains(m2,75));
        System.out.println(contains(m2,45));
    }}
