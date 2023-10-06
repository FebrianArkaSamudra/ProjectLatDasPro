import java.util.Scanner;

public class Selection2Exp310{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String category;
        int income, netSalary;
        double tax = 0;
        System.out.print("Input Category = ");
        category = scan.nextLine();
        System.out.print("Input Income   =  ");
        income = scan.nextInt();
        if(category.equalsIgnoreCase("Worker")){
            if(income <= 2000000)
                 tax = 0.1;
            else if(income <= 3000000)
                 tax = 0.15;
            else
                 tax = 0.2;
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett Salary    = "+netSalary);
        }else if(category.equalsIgnoreCase("Businessman")){
            if(income <= 2500000)
                 tax = 0.15;
            else if(income <= 3500000)
                 tax = 0.2;
            else
                 tax = 0.25;
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett Salary = "+netSalary);
        }else
            System.out.println("Invalid Category!");  
    }
}
