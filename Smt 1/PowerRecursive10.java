import java.util.Scanner;

public class PowerRecursive10 {
static int calculatePower(int base, int pow){
    if (pow == 0) {
        System.out.print("1");
        return 1;
    } else {
        int result = base * calculatePower(base, pow - 1);
        System.out.print("x" + base);
        return result;
    }
    }
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input Base Number: ");
    int base = input.nextInt();
    System.out.print("Input Power Number: ");
    int Power = input.nextInt();
    System.out.print("Result of " + base + " power " + Power + " = ");
        int result = calculatePower(base, Power);
        System.out.println(" = " + result);
   }
    
    
}