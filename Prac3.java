import java.util.*;

public class Prac3 {
    public static void main(String args[]) {
        Scanner meters = new Scanner(System.in);

        System.out.println("Enter size in meters : ");
        double meter = meters.nextDouble();

        double feet = meter * 3.281;

        System.out.println("\nSize in meters : " + meter);
        System.out.println("Size in feets : " + feet);

        meters.close();

    }
}
