import java.util.Scanner;

public class Greetings {
    public static String getGreetingRecipient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank You " + name+" May the force be with you");
    }
}