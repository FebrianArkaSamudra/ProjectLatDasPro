public class stackmainassignment {
    public static void main(String[] args) {
        Stackassignment stack = new Stackassignment();

        String[] data = {"Bahasa", "Android", "Komputer", "Basis Data", "Matematika", "Algoritma", "Statistika", "Multimedia"};

        for (int i = 0; i < data.length; i++) {
            stack.push(data[i]);
        }

        stack.print();
    }
}