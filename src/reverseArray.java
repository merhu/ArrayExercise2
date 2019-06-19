import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {

//Write a program to print a string in reverse:
        System.out.println ( "This program is going to print a string in reverse!" );
        String str = "myClass";
        char[] strArr = str.toCharArray ();
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print ( strArr[i] );

        }
    }
}
