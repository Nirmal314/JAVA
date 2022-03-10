import java.util.Arrays;

import javax.lang.model.type.ArrayType;

// Write a program for calculator to accept an expression as a string in which the operands and
// operator are separated by zero or more spaces.
// For ex: 3+4 and 3 + 4 are acceptable expressions.

public class Prac13 {
    public static void main(String args[]) {
        int arr[] = {}, j = 0;
        String exp = "3+4/5";
        for (int i = 0; i < exp.length(); i++) {
            if (Character.isDigit(exp.charAt(i))) {
                arr[j] = Character.getNumericValue(exp.charAt(i));
                j++;
            }
            if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
                // operator is scanned
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
