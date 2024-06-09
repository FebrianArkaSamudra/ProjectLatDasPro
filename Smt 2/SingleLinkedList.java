public class SingleLinkedList {
    NodeSLL head;
    NodeSLL tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeSLL tmp = head;
            System.out.print("Linked list content: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void addFirst(int input) {
        NodeSLL ndInput = new NodeSLL(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input) {
        NodeSLL ndInput = new NodeSLL(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        NodeSLL ndInput = new NodeSLL(input, null);
        NodeSLL temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeSLL temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeSLL(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }
    public int getData(int index) {
        NodeSLL temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int indexOf(int key) {
        NodeSLL temp = head;
        int index = 0;
        while (temp != null && temp.data != key) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Can not remove data");
        } else if (head == tail) {
            head = tail = null;        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Can not remove data");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeSLL temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Can not remove data");
        } else {
            NodeSLL temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) {
                    this.removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeSLL temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
    public void insertBefore(int key, int input) {
        NodeSLL ndInput = new NodeSLL(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else if (head.data == key) {
            addFirst(input);
        } else {
            NodeSLL temp = head;
            while (temp.next != null && temp.next.data != key) {
                temp = temp.next;
            }
            if (temp.next != null) {
                ndInput.next = temp.next;
                temp.next = ndInput;
            }
        }
        
        }
}