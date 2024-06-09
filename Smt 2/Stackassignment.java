public class Stackassignment {
    singlelinkedlistassignment singLL = new singlelinkedlistassignment();

    public void push(String data) {
        singLL.addFirst(data);
    }

    public String pop() {
        String data = singLL.getData(0);
        singLL.removeFirst();
        return data;
    }

    public void print() {
        singLL.print();
    }
}