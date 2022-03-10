class SmallestFactors {
    public static void main(String args[]) {
        int n = 120;
        int a = 2;
        while (n > 1) {
            if (n % a == 0) {
                System.out.println(a + " ");
                n = n / a;
            } else {
                a++;
            }
        }
    }
}
