// Write a method with following method header.
// public static int gcd(int num1, int num2)
// Write a program that prompts the user to enter two integers and compute the gcd of two integers.

public class Prac9 {
    public static int gcd(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }

        if (num1 == num2) {
            return num1;
        }

        if (num1 > num2) {
            return gcd(num1 - num2, num2);
        }
        return gcd(num1, num2 - num1);
    }

    public static void main(String args[]) {
        int a = 98, b = 56;
        System.out.println("GCD of " + a + " and " + b + " is : " + gcd(a, b));
    }
}
