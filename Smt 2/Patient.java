public class Patient {

    String name;
    int age, doctorFee;
    int [] medicationPrice = new int[3];
    
    public Patient(String na, int ag, int[] medicationPrice, int dF){
        this.name =na;
        this.age = ag;
        this.medicationPrice = medicationPrice;
        this.doctorFee = dF;
    }
    void printData(){
        System.out.println();
        System.out.println("Name = " + name);
        System.out.println("Age  = " + age);
        System.out.println("Medication Price 1 = " + medicationPrice);
        System.out.println("Medication Price 2 = " + medicationPrice);
        System.out.println("Medication Price 3 = " + medicationPrice );
        System.out.println("Doctor Fee = " + doctorFee);
        System.out.println("Average Medication Price = " + averageMediactionPrice());
        System.out.println("Total Fee = " + totalFee());
        System.out.println("==============================");
        System.out.println();
    }
    double averageMediactionPrice(){
        int sum = 0;
        for (int price : medicationPrice){
            sum = sum + price;
        }
        return sum / medicationPrice.length;
    }
    double totalFee(){
        return averageMediactionPrice() + doctorFee;
    }
    
} 