public class HighAchieverStudent {
    Student_10[] list = new Student_10[5];
    int idx;

    void add(Student_10 std) {
        if (idx<list.length) {
            list[idx] = std;
            idx++;
        } else {
            System.out.println("The student list is already full-filled");
        }
    }

    void print() {
        for (Student_10 student : list) {
            student.print();
            System.out.println("==========================================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length-i-1; j++) {
                if (list[j].gpa > list[j-1].gpa) {
                    Student_10 tmp = list[j-1];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
        }
    }
}