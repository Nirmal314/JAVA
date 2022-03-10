// Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a
// program to generate a plate number.

public class Prac7 {
    public static void main(String[] args) {

        String numPlate = "" + (char) (Math.random() * 26 + 65);
        numPlate += (char) (Math.random() * 26 + 65);
        numPlate += (char) (Math.random() * 26 + 65);
        numPlate += (int) (Math.random() * 10);
        numPlate += (int) (Math.random() * 10);
        numPlate += (int) (Math.random() * 10);
        numPlate += (int) (Math.random() * 10);
        System.out.println("Randomized numberplate is : " + numPlate);

    }
}
