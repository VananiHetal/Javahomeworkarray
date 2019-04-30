public class Transpose_matrix_2DArrays {

    //10. Write a 2-D array .. and WAP to transpose a matrix.. (row value should be transposed to col-
    //umn and column value should be printed in row)
  // main method

    public static void main(String[]args){

        // creating matrix
        int original[][] ={{5,6,7},{8,9,10},{11,12,13}};

        System.out.println("Printing matrix without transpose");
        for(int i=0; i<3; i++) {

            for (int j=0; j<3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println(); //new line
        }

        System.out.println("Printing Matrix After Transpose:");
        for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            System.out.print(original[j][i]+"");
        }
        System.out.println(); //new line
        }
        }}
