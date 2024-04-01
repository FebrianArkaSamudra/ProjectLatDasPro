import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        HighAchieverStudent data = new HighAchieverStudent();
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print("Name          =  ");
            String name = s2.nextLine();
            System.out.print("Entrance year =  ");
            int year = s1.nextInt();
            System.out.print("Age           = ");
            int age = s1.nextInt();
            System.out.print("GPA           = ");
            int gpa = s1.nextInt();

           Student_10 s = new Student_10(name, year, age, gpa);
            data.add(s);
        }

        System.out.println("Unsorted student list:");
        data.print();

        System.out.println("Student data after sorted in decending order in gpa: ");
        data.bubbleSort();
        data.print();

    }
}