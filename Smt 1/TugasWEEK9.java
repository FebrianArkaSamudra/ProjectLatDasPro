import java.util.Scanner;

public class TugasWEEK9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index,total, value=0;
        System.out.print("Input Element : ");
        index = scan.nextInt();
        int[] element = new int[index];
        for (int i = 0;i < element.length;i++) {
            System.out.print("Input value to the element : ");
            element[i] = scan.nextInt();
        } 
        int min = element[0], max = element[0];
        for (int i = 0;i < element.length;i++){
            value = element[i] + value;
            if (min > element[i]){
                min = element[i];
            }else if (max < element[i]){
                max = element[i];
            }
        }
        total = value / element.length;
        System.out.println("The Lowest Value   :" + min);
        System.out.println("The Highest Value  :" + max);
        System.out.println("The Average Values :" + total);     
    }
}