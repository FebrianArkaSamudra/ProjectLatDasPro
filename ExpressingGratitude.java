import java.util.Scanner;

public class ExpressingGratitude {
    public static String getGreetingRecipient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    public static void sayThankyou(){
        String name = getGreetingRecipient();
        System.out.println("Thaknyou for "+name+" being the best teacher in the world.\n"+
        "you inspired in me a love for learning and made me feel like i could ask you anything. ");
    }
    public static void sayAdditionalGreetings(String additionalGreeting) {
        System.out.println(additionalGreeting);
    }
    public static void main(String[] args) {
        sayThankyou();

    }
}