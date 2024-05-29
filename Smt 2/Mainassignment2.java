public class Mainassignment2 {
    public static void main(String[] args) {
        Assignment2 stack = new Assignment2(8);
        int[] transactionIDs = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] date = {" 4 February 2024", "11 February 2024", "18 February 2024", "25 February 2024", " 3 March 2024", "10 March 2024", "17 March 2024", "24 March 2024"};
        int[] quantity = {5, 7, 8, 6, 7, 7, 5, 6};
        double[] transactionTotal = {100000, 200000, 300000, 400000, 450000, 500000, 650000, 700000};
        System.out.println("");
        
        System.out.println("| Transaction ID | Date             | Quantity | Total Price   |");
System.out.println("|----------------|------------------|----------|---------------|");
for (int i = 0; i < stack.size; i++) {
    System.out.printf("| %-14d | %-16s | %-8d | %,-13.2f |\n", transactionIDs[i], date[i], quantity[i], transactionTotal[i]);
}

        System.out.println();

        for (int i = 0; i < stack.size; i++) {
            Receipts receipts = new Receipts(transactionIDs[i], date[i], quantity[i], transactionTotal[i]);
            stack.push(receipts);
        }

        int requestedReceipts = 5;
        System.out.println("--------Last 5 data---------");
        stack.print(requestedReceipts);
    }
}