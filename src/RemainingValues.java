import java.util.Arrays;
import java.util.Scanner;

public class RemainingValues {

        //Prompt the user to input 10 values and store them into an array.
        // If there are any duplicate values in that array,
        // remove them and print out the remaining values.

    public static int DuplicateRemoval(int array[], int n){
        System.out.println ( "This program finds any duplicate number from the user input and removes and sorts the array!" );

        if (n==0 || n==1){
            return n;
        }
        int k = 0;
        for (int i=0; i < n-1; i++){
            if (array[i] != array[i+1]){
                array[k++] = array[i];
            }
        }
        array[k++] = array[n-1];
        return k;
    }

    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=input.nextInt();

        int array[]=new int[n];
        System.out.println("Enter the elements one by one:");
        for (int s=0;s<array.length;s++){
            array[s]=input.nextInt();
        }
        Arrays.sort(array);
        int return_value= DuplicateRemoval(array, array.length);
        System.out.println("Sorted Array after removing the Duplicate Elements:");
        for (int i=0; i<return_value; i++)
            System.out.print(array[i]+" ");
    }
}