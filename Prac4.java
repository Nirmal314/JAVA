import java.util.Scanner;

public class Prac4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter weight in pounds : ");
        double weight_pound = scan.nextDouble();

        System.out.println("Enter height in inches : ");
        double height_inches = scan.nextDouble();

        double weight_kg = weight_pound / 2.206;
        double height_meter = height_inches * 0.0254;

        double BMI = weight_kg / (Math.pow(height_meter, 2));

        System.out.println("BMI : " + BMI);

        scan.close();
    }
}