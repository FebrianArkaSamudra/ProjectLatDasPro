import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

        System.out.print("Input Nilai Tugas : ");
        nilaiTugas = scan.nextInt();
        System.out.print("Input Nilai Kuis : ");
        nilaiKuis = scan.nextInt();
        System.out.print("Input Nilai UTS : ");
        nilaiUTS = scan.nextInt();
        System.out.print("Input Nilai Uas : ");
        nilaiUAS = scan.nextInt();

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("NILAI TIDAK VALID");
        }

        System.out.println("=============================");

        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        System.out.println("Nilai akhir : " + nilaiAkhir);

        String nilaiHuruf = " ";
        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80 ){
            nilaiHuruf = "B+";
        }else if (nilaiAkhir  > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
        }else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
        }else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
        }else if (nilaiAkhir > 39 && nilaiAkhir <= 60){
            nilaiHuruf = "D";
        }else{
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Huruf :" +nilaiHuruf);

        String pesan = " ";
        if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "B" || nilaiHuruf == " C+" || nilaiHuruf == "C"){
            pesan = "lulus";
        }else{
            pesan = "tidak lulus";
        }
        System.out.println("=============================");
        System.out.println("Anda dinyatakan " + pesan);
    }
}