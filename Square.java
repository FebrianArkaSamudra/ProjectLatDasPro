import java.util.Scanner;
public class Square {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
            int N = scan.nextInt();
        
            for(int iouter=0; iouter<=N; iouter++){
                for(int i = 1; i<=N ; i++){
                    System.out.print("*");
                }
                System.out.println();
            }
           
    }
    
}