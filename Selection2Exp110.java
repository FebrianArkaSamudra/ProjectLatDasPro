import java.util.Scanner;
public class Selection2Exp110{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int year = 2100;
        if(year%4 == 0)
            if(year%100 != 0)
            System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");
    }
}