public class Student {
    String nim, name;
    double gpa;

    public Student(String ni, String na, double gp){
        nim = ni;
        name = na;
        gpa = gp;
    }

    void printData(){
        System.out.println("NIM = "+nim);
        System.out.println("Name = "+name);
        System.out.println("GPA = "+gpa);
    }
    
}