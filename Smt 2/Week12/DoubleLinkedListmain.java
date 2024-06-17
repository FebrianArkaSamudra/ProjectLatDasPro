public class DoubleLinkedListmain {
    public static void main(String[] args)throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size: " + dll.size);
        System.out.println("================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size);
        System.out.println("================================================");

        dll.add(40,1);
        dll.print();

        System.out.println("Size: " + dll.size);
        System.out.println("================================================");
        System.out.println("Data in the head of the linked list is : " + dll.getFirst());
        System.out.println("Data in the tail of the linked list is : " + dll.getLast());
        System.out.println("Data in the 1st index of the linked list is : " + dll.get(1));
    }
}