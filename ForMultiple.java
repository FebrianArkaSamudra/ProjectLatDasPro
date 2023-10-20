import java.util.Scanner;
public class ForMultiple {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int multiple;
    int counter = 0;
    int sum = 0;
    double cumulativeSum = 0; 
    double average;

        System.out.print("Input the multiple = ");
        multiple = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
                cumulativeSum += i; 
            }
        }

        System.out.printf("There are %d numbers that are multiples of %d in the range 1 to 50. \n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d.\n", multiple, sum);

        
        average = cumulativeSum / counter;
        System.out.printf("The average of all multiples of %d in the range 1 to 50 is %.2f.\n", multiple, average);

    }
}