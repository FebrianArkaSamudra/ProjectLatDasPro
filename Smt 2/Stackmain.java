public class Stackmain {

    public static void main(String[] args) {
        Stack stk = new Stack(5);
        stk.push(15);
        stk.push(27);
        stk.push(13);
        stk.print();
        stk.push(11);
        stk.push(34);
        stk.pop();
        stk.peek();
        stk.print();
    }
}