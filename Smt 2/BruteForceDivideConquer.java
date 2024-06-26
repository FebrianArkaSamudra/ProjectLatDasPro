import java.util.Scanner;

public class BruteForceDivideConquer {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("========================================================");
      System.out.print("Input the number of elements you want to count : ");  
      int elemen = sc.nextInt();

      Faktorial [] fk = new Faktorial[elemen];
      for (int i = 0; i < elemen; i++) {
         fk[i] = new Faktorial();
         System.out.print("Input the data value to-"+(i+1)+" : ");
         fk[i].num = sc.nextInt();
      }

      System.out.println("==================================================");
      System.out.println("Factorial Results with Bruce Force");
      for (int i = 0; i < elemen; i++) {
         long faktorialBFStart = System.nanoTime();
         System.out.println("Factorial of value "+fk[i].num+" is : "+fk[i].faktorialBF(fk[i].num));
         long faktorialBFEnd = System.nanoTime();
         System.out.printf("Time in nanosecond: %,d\n",faktorialBFEnd - faktorialBFStart);
      }
      System.out.println("===================================================");
      System.out.println("Factorial Results with Divide and Conquer");
      for (int i = 0; i < elemen; i++) {
         long faktorialDCStart = System.nanoTime();
         System.out.println("Factorial of value "+fk[i].num+" is : "+fk[i].faktorialDC(fk[i].num));
         long faktorialDCEnd = System.nanoTime();
         System.out.printf("Time in nanosecond: %,d\n",faktorialDCEnd - faktorialDCStart);
      }
      System.out.println("==================================================");
   
      sc.close();
   }
   
   
}