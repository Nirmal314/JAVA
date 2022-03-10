public class Prac12 {
    public static void main(String[] args) {
        java.util.Random randomNo = new java.util.Random(1000);
        // displays first 100 random integers between 0 to 49
        System.out.println(" 100 Random numbers are : ");
        for (int i = 0; i < 100; i++) {
            System.out.print(randomNo.nextInt(49) + " ");
        }
    }
}
