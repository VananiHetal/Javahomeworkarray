public class Count_Totalnumber_of_a {

    //12.WAP to enter any String and count total number of 'a' in that String.

    // main method

    static int countOccurrence(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.print(countOccurrence("anamika", 'a'));
    }


}
