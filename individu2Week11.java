import java.util.Scanner;

public class individu2Week11 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = scan.nextInt();
if (N>=5) {
int i = N;
while (i>=1) {
    int j = 1;
    while (j<=i) {
        System.out.print("*");
        j++;
    }
    System.out.println();
    i--;
}
}
else{
    System.out.println("minimal input 5 ");
}

    }
}