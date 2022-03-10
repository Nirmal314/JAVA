import java.util.*;

public class Prac2 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        // ax+by=e

        System.out.println("For first equation.\n");

        System.out.println("Enter value of a : ");
        double a = value.nextDouble();

        System.out.println("Enter value of b : ");
        double b = value.nextDouble();

        System.out.println("Enter value of e : ");
        double e = value.nextDouble();

        // cx+dy=f
        System.out.println("\nFor second equation.\n");

        System.out.println("Enter value of c : ");
        double c = value.nextDouble();

        System.out.println("Enter value of d : ");
        double d = value.nextDouble();

        System.out.println("Enter value of f : ");
        double f = value.nextDouble();

        // x=ed-bf / ad-bc
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));

        // y=af-ec / ad-bc
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("\nx = " + x);
        System.out.println("y = " + y);

        value.close();
    }
}