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

import java.util.Arrays;

import javax.lang.model.type.ArrayType;

// Write a program for calculator to accept an expression as a string in which the operands and
// operator are separated by zero or more spaces.
// For ex: 3+4 and 3 + 4 are acceptable expressions.

public class Prac13 {
    public static void main(String args[]) {
        int arr[] = {}, j = 0;
        String exp = "3+4/5";
        int i=0;
        int k=1;
        int j=2;
        int a,b;
        int res;
        while(i<=arr.length-2 && j<=arr.length && k<=arr.length-1){
            if(Character.isDigit(exp.length(i)) && Character.isDigit(exp.length(i))){
                a=exp.charAt(i);
                b=exp.charAt(j);
            }
            if(exp.charAt(k)=="+"||exp.charAt(k)=="-"||exp.charAt(k)=="*"||exp.charAt(k)=="/"){
                switch(exp.charAt(k)){
                    case '+':
                         res = a + b;
                        System.out.println("a+b = "+ res);
                        break;
                    case '-':
                         res = a - b;
                        System.out.println("a-b = "+ res);
                        break;
                    case '*':
                         res = a * b;
                        System.out.println("a*b = "+ res);
                        break;
                    case '/':
                        double res = a / b;
                        System.out.println("a/b = "+ res);
                        break;
                    default:
                        System.out.println("Invalid");

                }
            }


            i=i+2;
            j=j+2;
        }

    }
}
