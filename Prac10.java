// Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the
// numbers, display the numbers.

import java.util.Scanner;

public class Prac10 {
    public static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static int[] arr_rev(int arr[]) {
        int arr_tmp[] = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr_tmp[j] = arr[i];
            j++;
        }
        return arr_tmp;
    }

    public static void main(String args[]) {
        // Object for scanner
        Scanner in = new Scanner(System.in);

        // Getting array size from user
        System.out.print("Enter size of array : ");
        int size = in.nextInt();

        // Initiallizing array
        int arr[] = new int[size];

        // Taking input from user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th element : ");
            arr[i] = in.nextInt();
        }

        // Printing original array
        System.out.println("\nOriginal array : \n");
        print_arr(arr);

        // Declaring resultant array and assigning the reversed values from arr
        int reversedArray[] = arr_rev(arr);

        // Printing reversed array
        System.out.println("\nReversed array : \n");
        print_arr(reversedArray);

        // Closing scanner
        in.close();
    }
}
