import java.util.Scanner;
public class DoWhileLeaveEntitlement{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;
        System.out.print("Number of Leave Entitlement = ");
        leaveEntitlement = scan.nextInt();

        do{
            System.out.print("Do you want to take leave (y/t) = ");
            confirmation = scan.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Leave number = ");
                numLeave = scan.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("the remaining leave entiltlement = "+ leaveEntitlement);
                } else {
                    System.out.println("The remaining leave entitlement is not sufficient!");
                    break;
                }
            } 
        
        } while (leaveEntitlement >  0);
    }
}