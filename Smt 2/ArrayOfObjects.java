import java.util.Scanner;

public class ArrayOfObjects {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the length of an array : ");
        int n = sc.nextInt();
        Rectangle[] rectangleArray = new Rectangle[n];

        for (int i = 0; i<3; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);
            
            System.out.print("Input length : ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width : ");
            rectangleArray[i].width = sc.nextInt();
        }

    System.out.println();
    System.out.println("This is the results of width and height");    

    for (int i = 0;  i < rectangleArray.length; i++) {
        System.out.println("Rectangle " + i);
        System.out.println("Width: " + rectangleArray[0].width + ", length: " + rectangleArray[i].length);
    }

    /*rectangleArray[0] = new Rectangle();
    rectangleArray[0].length =110;    
    rectangleArray[0].width = 30;

    rectangleArray[1] = new Rectangle();
    rectangleArray[1].length = 80;    
    rectangleArray[1].width = 40;

    rectangleArray[2] = new Rectangle();
    rectangleArray[2].length = 100;    
    rectangleArray[2].width = 20;

    System.out.println("First rectangle, width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
    System.out.println("First rectangle, width: " + rectangleArray[1].width + ", length: " + rectangleArray[1].length);
    System.out.println("First rectangle, width: " + rectangleArray[2].width + ", length: " + rectangleArray[2].length);*/
    }
   
}