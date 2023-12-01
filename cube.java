import java.util.Scanner;

public class cube {

    public static void main(String[] args) {
        double area = calculateArea(10);
        double volume = calculateVolume(10);

        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        area = calculateArea(side);
        volume = calculateVolume(side);
        System.out.println("Area = "+area);
        System.out.println("Volume = "+volume);
    }
    static double calculateVolume(int side){
        double volume = 0;
        volume = side*side*side;
        return volume;
    }
    static double calculateArea(int side){
        double area = 0;
        area = 12*side;
        return area;
    }
}