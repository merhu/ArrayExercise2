import java.util.Arrays;

public class MatchingPairs {
    public static void main(String[] args) {


        System.out.println ( "This program is going to print all matching pairs from Array 1 and 2 " );

        int[] array1 = {1, 7, 6, 5, 9};
        int[] array2 = {2, 7, 6, 3, 4};

        System.out.println ( "Array 1 is :" + Arrays.toString ( array1 ) );
        System.out.println ( "Array 2 is:" + Arrays.toString ( array2 ) );

        for (int l = 0; l < array1.length; l++) {
            if (array1[l] == array2[l]) {
                System.out.println ( array1[l] + " " + array2[l] + "" );

            } else ;
        }
    }
}