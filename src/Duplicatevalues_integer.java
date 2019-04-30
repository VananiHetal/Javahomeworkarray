public class Duplicatevalues_integer {

    //WAP to find dulplicate  values of an array of integer value.

    // main method

    public static void main(String[] args){
       int[] a = {11,11,12,12,13,13,14,15}; // a is array

       for( int i =0; i<a.length-1; i++ )
       {
           for(int j =i+1; j<a.length; j++)
           {
             if (a[i] == a[j] && (i != j))
             {
                 System.out.println("Duplicate element :" + a[j]);
             }
           }
       }


    }

}

