import java.util.Scanner;

public class BookMain {
    static BookStack st = new BookStack(8);
    static Scanner scan = new Scanner(System.in);
    static void callPush() {
        System.out.print("Title : ");
        String title = scan.nextLine();
        
        System.out.print("Author Name : ");
        String name = scan.nextLine();

        System.out.print("Published year : ");
        int year = scan.nextInt();

        System.out.print("Pages Amount : ");
        int pages = scan.nextInt();

        System.out.print("Price : ");
        int price = scan.nextInt();
        
        BookStack bk = new BookStack(title, name, year, pages, price);
        st.push(bk);
    }
    public static void main(String[] args) {
        char choose;
        do{
            System.out.print("Title : ");
            String title = scan.nextLine();
            
            System.out.print("Author name : ");
            String name = scan.nextLine();
            
            System.out.print("Published year : ");
            int year = scan.nextInt();
            
            System.out.print("Pages Amount");
            int pages = scan.nextInt();
            
            System.out.print("Price");
            int price = scan.nextInt();
            
            Book bk = new Book(title, name, year, pages, price);
            System.out.print("Do you want to add new data to stack (y/n) ? ");
            choose = scan.next().charAt(0);
            scan.nextLine();
            st.push(bk);
        }while(choose == 'y');
       /* 
       st.print();
       st.pop();
       st.peek();
       st.print();
       */
      Boolean done = false;
        while (!done) {
            System.out.println("Which operation would you like to do?");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. print");
            System.out.print("Menu: ");
            char menu = scan.nextLine().charAt(0);
            switch (menu) {
                case '1':
                    callPush();
                    break;
                case '2':
                    st.pop();
                    break;
                case '3':
                    st.peek();
                    break;
                case '4':
                    st.print();
                    break;
                default:
                    System.out.println("Please insert number as displayed in the menu!");
                    break;
                }
            System.out.println("Would you like to do another operation?");
            System.out.print("Menu (Y/n): ");
            char option = scan.nextLine().charAt(0);
            if (option == 'n' || option == 'N') {
                done = true;
            }
        }
    }
}