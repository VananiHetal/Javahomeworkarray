public class Total_Words_Spaces {

    //WAP to enter any String and count how many total number of words and total number of spa-
    //ces in that sentence
public static void main(String...s)
{
    int word=1;
    String str="java is based on oops concepts"; // the words and spaces tob counted from this string

    for(int i=0; i<str.length() ;++i) //
    {
        if(str.charAt(i)==' ')
            word++;
    }

    System.out.println("Number of words="+word);
    System.out.println("Number of spaces="+(word-1));
}
}