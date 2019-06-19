import java.util.Scanner;

public class OddAndEvenValues {
    public static void main(String[] args) {
        //Prompt the user to input 10 values and store them into an array.
        // Output the total number of odd and even values in the array.
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements you want in array: ");     //user input
        n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements one by one:");                   //user input


        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Odd number: ");
        for (int i = 0; i < a.length; i++) {                  // find odd
            if (a[i] % 2 != 0) {
                System.out.println(a [i] + "");
            }
        }

        int i=0;

        System.out.println("");
        System.out.println("Even numbers: ");
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {                        //find even
                System.out.println(a[i] + "");


            } else ;
        }
    }
}
