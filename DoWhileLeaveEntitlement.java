import java.util.Scanner;
public class DoWhileLeaveEntitlement {
public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int leaveEntitlement, numLeave = 0;
    String confirmation;
    System.out.println("Entitlement leave: ");
    leaveEntitlement = inp.nextInt();
    do {
    System.out.println("Do you want to take a leave? Y/N");
    confirmation = inp.next();
    if (confirmation.equalsIgnoreCase("y")) {
    System.out.println("Leave number: ");
    numLeave = inp.nextInt();
    if (numLeave <= leaveEntitlement) {
    leaveEntitlement -= numLeave;
    System.out.println("Remaining leave allowance: " 
   + leaveEntitlement);
    } else {
    System.out.println("Your inputted value is too greater than your current leave allowance");
    } if (numLeave == 0) {
    System.out.println("No leave allowance left.");
    break;
    }
    } else {
    System.out.println("You are a good citizen. Good job not having a life");
    leaveEntitlement = 0;
    }
    } while (leaveEntitlement > 0);
   
}  
}