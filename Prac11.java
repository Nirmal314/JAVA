// // Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s ,
// //  display the matrix, check every row and column have an odd number’s of 1’s.

public class Prac11 {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][] = new int[6][6];
        int i, j;

        for (i = 0; i < 5; i++) {
            int count = 0;
            for (j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 2);
                count += arr[i][j];
            }
            if (count % 2 == 0)
                arr[i][5] = 1;
            else
                arr[i][5] = 0;
        }

        for (j = 0; j < 6; j++) {
            int count = 0;
            for (i = 0; i < 5; i++) {
                count += arr[i][j];
            }
            if (count % 2 == 0)
                arr[5][j] = 1;
            else
                arr[5][j] = 0;
        }
        printArray(arr);
    }
}