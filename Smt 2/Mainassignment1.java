import java.util.Scanner;
public class Mainassignment1 {
    //main stack
public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 System.out.print("Insert Sentence: ");
 String sentence = scan.nextLine(); 

 Assignment1 stk = new Assignment1(sentence.length());
 for (int i = 0; i < sentence.length(); i++) {
     stk.push(sentence.charAt(i));
 }
 stk.print();
 
 
    
    
}
}