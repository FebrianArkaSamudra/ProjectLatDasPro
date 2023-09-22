import java.util.Scanner;
public class pararel {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double r1,r2,r3,r4,i,v,seri,pararel;
        int jenis;

        System.out.print("Masukkan R1: ");
        r1 = sc.nextInt();
        System.out.print("Masukkan R2: ");
        r2 = sc.nextInt();
        System.out.print("Masukkan R3: ");
        r3 = sc.nextInt();
        System.out.print("Masukkan R4: ");
        r4 = sc.nextInt();
        System.out.print("Masukkan I: ");
        i = sc.nextInt();

        double RTotal;
        RTotal = r4 + ((1.0/r1) + (1.0/r2) + (1.0/r3));
        v = (i * RTotal);
        System.out.print("Hasilnya adalah: " + v);
        
    }
}
