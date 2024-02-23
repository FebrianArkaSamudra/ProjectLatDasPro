public class Fibonacci {

    public static void main(String[] args) {
        int months = 12;
        int[] productivePairs = new int[months];
        int[] nonProductivePairs = new int[months];
        int[] totalPairs = new int[months];
    
        // Initial values
        productivePairs[0] = 0;
        nonProductivePairs[0] = 1;
        totalPairs[0] = 1;
    
        // Values for the second month
        productivePairs[1] = 0;
        nonProductivePairs[1] = 1;
        totalPairs[1] = 1;
    
        System.out.println("Month\tProductive\tNon-Productive\tPair Total");
        for (int i = 2; i < months; i++) {
            productivePairs[i] = nonProductivePairs[i - 1];
            nonProductivePairs[i] = productivePairs[i - 1] + nonProductivePairs[i - 1];
            totalPairs[i] = totalPairs[i - 1] + productivePairs[i];
    
            System.out.println((i + 1) + "\t" + productivePairs[i] + "\t\t" + nonProductivePairs[i] + "\t\t" + totalPairs[i]);
        }
    }
    
}
