public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student("m01", "student 1", 3.54);
        Student s2 = new Student("m02", "student 2", 3.4);
        Student s3 = new Student("m03", "student 3", 3.88);
        Student s4 = new Student("m04", "student 4", 3.25);
        Student s5 = new Student("m05", "student 5", 2.98);
        Student sData[] = {s1,s2,s3,s4,s5};

        for(Student std:sData){
            /*System.out.println("Nim = "+std.nim);
            System.out.println("Nama = "+std.name);
            System.out.println("GPA = "+std.gpa);*/
            std.printData();
        }
        
        //find max GPA
        double maxGPA = sData[0].gpa;
        int idx = 0;
        //String nimMax=sData[0].nim, nameMax=sData[0].name;
        for(int i=1;i<sData.length;i++){
            if(sData[i].gpa>maxGPA){
                maxGPA = sData[i].gpa;
                idx = i;
                //nimMax = sData[i].nim;
                //nameMax = sData[i].name;
            }
        }
        System.out.println("Max GPA = "+maxGPA);
        System.out.println("Nim = "+sData[idx].nim);
        System.out.println("Name = "+sData[idx].name);
        //System.out.println("Nim = "+nimMax);
        //System.out.println("Name = "+nameMax);

        //findMaxGPA(sData);
    }
    static void findMaxGPA(Student[] param){
        //find max GPA
        double maxGPA = param[0].gpa;
        for(int i=1;i<param.length;i++){
            if(param[i].gpa>maxGPA){
                maxGPA = param[i].gpa;
            }
        }
        System.out.println("Max GPA = "+maxGPA);
    }
}