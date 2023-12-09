public class PrimeChecking {

    public static void main(String[] args) {
        int n = 13; 
        boolean isPrime = primeCheckingRecursive(n);

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    static boolean primeCheckingRecursive(int n) {
        return isPrimeRecursive(n, 2);
    }

    static boolean isPrimeRecursive(int n, int divisor) {
        if (n <= 1) {
            return false; 
        }
        if (divisor == n) {
            return true;
        }
        if (n % divisor == 0) {
            return false; 
        }
        // Check the next divisor
        return isPrimeRecursive(n, divisor + 1);
    }
}
