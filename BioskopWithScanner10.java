import java.util.Scanner;
public class BioskopWithScanner10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,column,select;
        String name,next;
        boolean list = true;
        String[][] audience = new String[4][2];
        while (list) {
            System.out.println("Choose menu:  \n1.Input audience data \n2.Show audience list \n3.Exit");
            select = sc.nextInt();
            if (select == 1) {
                 while (true) {
                System.out.print("Enter a name : ");
                name = sc.next();
                System.out.print("Enter row number : ");
                row = sc.nextInt();
                System.out.print("Enter column number : ");
                column = sc.nextInt();
                sc.nextLine();

                if(audience[row - 1][column - 1] == null){
                    audience[row - 1][column - 1] = name;
                System.out.println("Succesfuly booked");
                    
                }
                else{
                    System.out.println("The seat is already booked \nChoose the other");
                    break;
                }
                System.out.println("Are there any other audiences to be added? (y/n): ");
                next = sc.nextLine();

                if (next.equalsIgnoreCase("n")) {
                    break;
            }
        }
            }else if (select == 2){
                for (int i = 0; i < audience.length; i++){
                    System.out.println(String.join(", ",audience[i]) );
                }
            }else {
                list = true;
                break;
            }
           

        }
        
    }
}