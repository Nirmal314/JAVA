import java.util.*;

class Decreasing {
    public static void main(String args[]) {
        Scanner value = new Scanner(System.in);
        // 1 2 3
        // 1 3 2

        // 2 1 3
        // 2 3 1

        // 3 1 2
        // 3 2 1
        System.out.println("Enter first number : ");
        int num1 = value.nextInt();

        System.out.println("Enter second number : ");
        int num2 = value.nextInt();

        System.out.println("Enter third number : ");
        int num3 = value.nextInt();

        if (num1 < num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if (num3 > num2) {
            if (num3 > num1) {
                int tmp = num3;
                num3 = num2;
                num2 = num1;
                num1 = tmp;
            } else {
                int tmp = num3;
                num3 = num2;
                num2 = tmp;
            }
        }
        System.out.println("Decreasing order : " + num1 + " " + num2 + " " + num3);

        value.close();

    }
}