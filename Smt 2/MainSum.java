import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Program for Calculating Total Profits");
        System.out.print("Input the number of Months : ");
        int toElemen=sc.nextInt();
        Sum sm = new Sum(toElemen);
        sm.elemen = toElemen;

        System.out.println("================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Input the profit of the month to - "+(i+1)+" = ");
            sm.profit[i] = sc.nextDouble();
        }

        System.out.println("================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total profits of the company for " + sm.elemen + " month is = "
                +sm.totalBF(sm.profit));
        System.out.println("================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total profits of the company for " + sm.elemen + " month is = "
                +sm.totalDC(sm.profit, 0, sm.elemen-1));
    }
}