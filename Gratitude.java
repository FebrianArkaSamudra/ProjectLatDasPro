public class Gratitude {
    public static void sayThankyou(){
        System.out.println("Thaknyou for being the best teacher in the world.\n"+
        "you inspired in me a love for learnng and made me feel like i could ask you anything. ");
    }
    public static void sayAdditionalGreetings(String greeting){
        System.out.println(greeting);
    }
    public static void main(String[] args) {
        sayThankyou();
        String expression = "Thank you. . .wish you all the best!! ";
        sayAdditionalGreetings(expression);
    }
}
