public class ArraySum {
    public static void main(String[] args) {

        //Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //Write a program that will print out all
        // pairs from arrays 1 and 2 that gives a sum of 13:
        System.out.println ( "This program prints out all pairs from array 1 and 2 that gives a sum of 13! " );
        int[] myNum = new int[5];
        int[] num1 = {1, 7, 6, 5, 9,};
        int[] num = {2, 7, 6, 3, 4};
        int[] sum = {13};


        if (myNum.length < 2)

            return;

        System.out.println("The pair whose sum is equal to 13 : ");
        for (int i = 0; i < num1.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int tempSum = num1[i] + num[j];

                if (tempSum == 13) {
                    System.out.println(num1[i] +  " " + num[j]);
                }
            }
        }
    }
}