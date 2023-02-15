public class Main {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 100; i <= 150; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                counter++;
            }
        }
        System.out.println("Total Prime Numbers: " + counter);

    }

    public static boolean isPrime(int wholeNum) {
        if (wholeNum < 2)
            return false;

        for (int divisor = 2; divisor <= wholeNum / 2; divisor++) {
            if (wholeNum % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
