import java.util.Scanner;

public class Selection2{
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.print("Nilai uas   : ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input00.nextFloat();
        float total = (uas * 0.4F) +  (uts * 0.3F) +  (kuis * 0.1F) + (tugas * 0.2F);
        
        if (total > 80 && total <=100)
           System.out.println("Nilai Huruf : A, Nilai Setara: 4, Sangat Baik");
        else if (total > 73 && total <=80)
           System.out.println("Nilai Huruf : B+, Nilai Setara: 3.5, Lebih dari baik");
        else if (total > 65 && total <=73)
           System.out.println("Nilai Huruf : B, Nilai Setara: 3, Baik");
        else if (total > 60 && total <=65)
           System.out.println("Nilai Huruf : C+, Nilai Setara: 2.5, Lebih dari cukup");
        else if (total > 50 && total <=60)
           System.out.println("Nilai Huruf : C, Nilai Setara: 2, Cukup");
        else if (total > 39 && total <=50)
           System.out.println("Nilai Huruf : D, Nilai Setara: 1, Kurang");
        else 
           System.out.println("Nilai Huruf : E, Nilai Setara: 0, Gagal");
        
        
    }
}