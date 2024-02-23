import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1)); 
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();   
            }
            System.out.println();
        }
        int kotakIndex = 1;
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double totalTemp = 0;
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
                totalTemp += temp;
            }
             double averageTemp = totalTemp / temps[0].length;
            System.out.println("| Rata-rata Kota ke-" + (i + 1) + ": " + averageTemp);
            kotakIndex++;
            }
        }
    }
