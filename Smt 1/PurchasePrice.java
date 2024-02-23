import java.util.Scanner;
public class PurchasePrice{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int price, quantity;
        double discount=0.1, totalPrice, purchasePrice, totalDiscount;
        System.out.println("Input Price");
        price=input.nextInt();
        System.out.println("Input Quantity");
        quantity=input.nextInt();
        totalPrice=price*quantity;
        totalDiscount=price*discount;
        purchasePrice=totalPrice-totalDiscount;
        System.out.println("Total Discount: " +totalDiscount);
        System.out.println("Final Purchase price: " +purchasePrice);
    }
}