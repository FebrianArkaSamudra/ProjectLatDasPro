public class MainQuiz {
    
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
    
        // Add nodes to the front
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        System.out.println("=================================");
        System.out.println("Initial list:");
        dll.print();
    
        // Delete the first node
        dll.deleteFirst();
        System.out.println("After deleting the first node:");
        dll.print();
    
        // Add nodes to the end
        dll.addLast(5);
        dll.addLast(25);
        System.out.println("After adding nodes to the end:");
        dll.print();
    
        // Delete the last node
        dll.deleteLast();
        System.out.println("After deleting the last node:");
        dll.print();
    
        // Print the list from tail to head
        System.out.println("Print from tail to head:");
        dll.printFromTail();
    
        System.out.println("\n=================================");
        // Get position from tail
        int position = dll.getPositionFromTail(10);
        System.out.println("Position of 10 From Tail: " + position);
        
        // Get last position from tail
        int lastPosition = dll.getLastPositionFromTail(10);
        System.out.println("Last Position of 10 From Tail: " + lastPosition);
    
        // Get average
        double average = dll.getAverage();
        System.out.println("Average Value: " + average);
    
        // Get median
        double median = dll.getMedian();
        System.out.println("Median Value: " + median);
    }
}