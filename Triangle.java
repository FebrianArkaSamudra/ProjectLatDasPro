import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = scan.nextInt();
        int i = 0; 
        while (i <= N) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}