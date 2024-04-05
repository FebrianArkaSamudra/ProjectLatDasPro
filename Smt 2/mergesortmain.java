public class mergesortmain {
    public static void main(String[] args) {
        
        int data [] = {10,40,30,50,70,20,100,90};
        System.out.println("sorting with merge sort");
        mergeSorting msort = new mergeSorting();
        System.out.println("initial data");
        msort.printarray(data);
        msort.mergeSort(data);
        System.out.println("sorted data  ");
        msort.printarray(data);
    }
    
}