import java.util.*;

class VowelOrConstant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a char : ");
        char c = scan.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            System.out.println(c + " is vowel.");
        } else {
            System.out.println(c + " is consonent.");

        }

        scan.close();
    }
}