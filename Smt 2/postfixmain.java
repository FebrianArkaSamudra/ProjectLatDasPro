import java.util.Scanner;
public class postfixmain {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String P, Q;
    System.out.print("Insert mathematical expression (infix) : ");
    Q = scan.nextLine();
    Q = Q.trim();
    Q = Q + ")";

    int total = Q.length();

    postfix post = new postfix(total);
    P = post.convert(Q);
    System.out.println("Postfix : " + P);

    
        
    }
}