import java.util.Scanner;

public class TugasWeek1Ke2 {
    static Scanner scan = new Scanner(System.in);
    static double v, s, t;
    public static void main(String[] args) {
    int pilih;
        
        do {
            menu();
            System.out.print("Pilih menu : ");
            pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    kecepatan();
                    break;
                case 2:
                    jarak();
                    break;
                case 3:
                    waktu();
                    break;
                default:
                    break;
            }
        } while (pilih != 0); 
    }

    static void menu() {
        System.out.println("KALKULATOR RUMUS");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
    }

    static void kecepatan() {
        System.out.print("Masukkan Jarak: ");
        s = scan.nextDouble();
        System.out.print("Masukkan Waktu: ");
        t = scan.nextDouble();
        v = s/t;
        System.out.println("Kecepatan: " + v);
    }

    static void jarak() {
        System.out.print("Masukkan Kecepatan: ");
        v = scan.nextDouble();
        System.out.print("Masukkan Waktu: ");
        t = scan.nextDouble();
        s = v*t;
        System.out.println("Jarak: " + s);
    }

    static void waktu() {
        System.out.print("Masukkan Jarak: ");
        s = scan.nextDouble();
        System.out.print("Masukkan Kecepatan: ");
        v = scan.nextDouble();
        t = s/v;
        System.out.println("Waktu: " + t);
    }
}