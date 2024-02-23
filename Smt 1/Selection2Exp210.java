import java.util.Scanner;

public class Selection2Exp210{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int totalAngle;
        System.out.print("Masukkan angle1: ");
        int angle1 = scan.nextInt();
        System.out.print("Masukkan angle2: ");
        int angle2 = scan.nextInt();
        System.out.print("Masukkan angle3: ");
        int angle3 = scan.nextInt();
        totalAngle=angle1 + angle2 + angle3;
        if(totalAngle == 180){
            if (angle1 == 90 || angle2 == 90 || angle3 == 90){
                System.out.println("RIGHT TRIANGLE");
            }
                else if (angle1 == 60 && angle2 == 60 && angle3 == 60){
                System.out.println("equilateral triangle");
            }
            else if (angle1 == angle2 && angle3 == 80){
                System.out.println("isosceles triangle");
            }
        }
        else
        System.out.println("Not a triangle");
    }
}