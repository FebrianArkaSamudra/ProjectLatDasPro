public class DoubleLinkedList {
    Node head, tail;
    int size;
    
    DoubleLinkedList() {
        head = tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(int data) {
        Node nu = new Node(data);
        if (isEmpty()) {
            head = tail = nu;
        } else {
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    }

    void deleteFirst() {
        if (!isEmpty()) {
            head = head.n;
            if (head != null) {
                head.p = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.n;
        }
        System.out.println();
    }

    void addLast(int data) {
        Node nu = new Node(data);
        if (isEmpty()) {
            head = tail = nu;
        } else {
            tail.n = nu;
            nu.p = tail;
            tail = nu;
        }
        size++;
    }

    void deleteLast() {
        if (!isEmpty()) {
            tail = tail.p;
            if (tail != null) {
                tail.n = null;
            } else {
                head = null;
            }
            size--;
        }
    }

    void printFromTail() {
        Node tmp = tail;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.p;
        }
        System.out.println();
    }

    int getPositionFromTail(int data) {
        Node tmp = tail;
        int position = 0;
        while (tmp != null) {
            if (tmp.data == data) {
                return position + 1;
            }
            tmp = tmp.p;
            position++;
        }
        return -1;
    }

    int getLastPositionFromTail(int data) {
        Node tmp = tail;
        int position = 0;
        int lastPosition = -1;
        while (tmp != null) {
            if (tmp.data == data) {
                lastPosition = position + 1;
            }
            tmp = tmp.p;
            position++;
        }
        return lastPosition; 
    }

    double getAverage() {
        if (isEmpty()) return 0;
        Node tmp = head;
        int sum = 0;
        while (tmp != null) {
            sum += tmp.data;
            tmp = tmp.n;
        }
        return (double) sum / size;
    }

    Node getNodeByIndex(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.n;
        }
        return tmp;
    }

    void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                Node node1 = getNodeByIndex(j);
                Node node2 = getNodeByIndex(j - 1);
                if (node2.data > node1.data) {
                    int tmp = node2.data;
                    node2.data = node1.data;
                    node1.data = tmp;
                }
            }
        }
    }

    double getMedian() {
        if (isEmpty()) return 0;
        sort();
        if (size % 2 == 1) {
            return getNodeByIndex(size / 2).data;
        } else {
            int mid1 = getNodeByIndex((size / 2) - 1).data;
            int mid2 = getNodeByIndex(size / 2).data;
            return (mid1 + mid2) / 2.0;
        }
    }
   
}