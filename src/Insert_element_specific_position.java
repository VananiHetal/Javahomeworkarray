import java.util.Arrays;

public class Insert_element_specific_position {

    //wap to insert  an element(specific position) into array

    // main mathod

    public static void main(String[] args) {

        int[] array = {55, 88, 99, 66, 44, 33};

        // Insert an element in 4th position of the array (index->4, value->90),

        int Index_position = 4;
        int newValue = 90;

        System.out.println("Original Array : " + Arrays.toString(array));

        for (int i = array.length - 1; i > Index_position; i--) {
            array[i] = array[i - 1];
        }
        array[Index_position] = newValue;
        System.out.println("New Array: " + Arrays.toString(array));

    }
}
