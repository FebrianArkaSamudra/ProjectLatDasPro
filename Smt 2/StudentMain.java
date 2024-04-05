import java.util.Scanner;
public class StudentMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        System.out.println("Enter the amount of students");
        int amountStudent = s.nextInt();
        
        SearchStudent data = new SearchStudent(amountStudent);
        //int amountStudent = 5;

        System.out.println("--------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("----------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Name\t: ");
            String name = sl.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("--------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("________________________");
        System.out.println("________________________");
        System.out.print("Search student by Name: ");
        String searchName = sl.nextLine(); 
        //int potition = data.findSeqSearch(search);
        
        //data.showPosition(search, potition);
        
        //data.showData(search, potition);
        
        System.out.println("========================");
        System.out.print("Search student by Name: ");
        System.out.println("Using Sequential Search");
        //System.out.println("Using binary search");
        int potition1 = data.findSeqSearch(searchName);
        
        data.showPosition(searchName, potition1);
        data.showData(searchName, potition1);
    }
}