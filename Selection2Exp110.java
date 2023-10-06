import java.util.Scanner;
public class Selection2Exp110{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("input year: ");
        int year = scan.nextInt();
        if(year%4 == 0)
            if(year%100 != 0)
            System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");
    }
}