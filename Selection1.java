import java.util.Scanner;

public class Selection1{
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input00.nextInt();
        if (number % 2 == 0)
            System.out.println(number+" is an even number! ");
        else
            System.out.println(number+" is an odd number! ");

    }
}