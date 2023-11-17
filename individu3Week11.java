import java.util.Scanner;
public class individu3Week11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 0;i < x; i++){
            for(int j=0; j<x; j++){
            if (i==x-1 || i==0 || j==0 || j==x-1)
                System.out.print(x);
            else
            System.out.print(" ");
            }
            System.out.println();
        }
    }
}