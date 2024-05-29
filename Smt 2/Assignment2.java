public class Assignment2 {
    //stack
    int size, top;
    Receipts data[];
    
    public Assignment2(int size) {
        this.size = size;
        data = new Receipts[size];
        top = -1;
    }
    
    public boolean isEmpty() {
        if (top == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(Receipts dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full");
        }
    }
    
    public void pop() {
        if (!isEmpty()) {
            Receipts x = data[top];
            top--;
            System.out.println("Remove data : " + x.transactionID + " " + x.date + " " + x.quantity + " " + x.transactionTotal);
        } else {
            System.out.println("Stack is empty");
        }
    }
    
    public void peek() {
        System.out.println("Top element : " + data[top]);
    }
    
    public void print(int limit) {
        System.out.println("| Transaction ID | Date             | Quantity | Total Price   |");
        System.out.println("|----------------|------------------|----------|---------------|");
        int start = Math.max(0, top - limit + 1); // Ensure we don't go below the stack bounds
        for (int i = top; i >= start; i--) {
            System.out.printf("| %-14d | %-16s | %-8d | %,-13.2f |\n", data[i].transactionID, data[i].date, data[i].quantity, data[i].transactionTotal);
        }
        System.out.println("");
    }
    
    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack is now empty");
        } else {
            System.out.println("Failed ! Stack is still empty");
        }
    }
    }