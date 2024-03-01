import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] inputs = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };
        double[] value = new double[inputs.length];
        String[] gradeValue = new String[inputs.length];
        double[] scoreValue = new double[inputs.length];

        String[] grade = { "A", "B+", "B", "C+", "C", "D", "E" };
        double[] weightScore = { 4, 3.5, 3, 2.5, 2, 1, 0 };
        int[][] threshold = { { 80, 100 }, { 73, 80 }, { 65, 73 }, { 60, 65 }, { 50, 60 }, { 39, 50 }, { 0, 39 } };

        double totalValue = 0, totalSks = 0;
        System.out.println("=================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================================");

        for (int i = 0; i < value.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + inputs[i] + ": ");
            value[i] = in.nextDouble();

            for (int j = 0; j < threshold.length; j++) {
                if (value[i] > threshold[j][0] && value[i] <= threshold[j][1]) {
                    gradeValue[i] = grade[j];
                    scoreValue[i] = weightScore[j];
                    break;
                }
            }

        }

        for (int i = 0; i < gradeValue.length; i++) {
            totalValue += (scoreValue[i] * sks[i]);
            totalSks += sks[i];
        }

        System.out.println("=================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================");
        System.out.printf("%-40s | %-15s | %-15s | %-20s%n", "MK", "Nilai Angka", "Nilai Huruf",
                "Bobot Nilai");

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("%-40s | %-15s | %-15s | %-20s%n", inputs[i], value[i], gradeValue[i],
                    scoreValue[i]);
        }

        System.out.println("=================================");
        System.out.println("IP : "+ String.format("%.2f",totalValue/totalSks));
        System.out.println("=================================");

    }
}