import java.util.Scanner;

public class MainPatient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many OBJECT do you want = ");
        int i = sc.nextInt();
        Patient patientList[] = new Patient[i];

        for(int j = 0; j < patientList.length; j++){
            System.out.print("Name = ");
            String na = sc.next();
            System.out.print("Age = ");
            int ag = sc.nextInt();
            System.out.print("Medication Price 1 = ");
            int mP1 = sc.nextInt();
            System.out.print("Medication Price 2 = ");
            int mP2 = sc.nextInt();
            System.out.print("Medication Price 3 = ");
            int mP3 = sc.nextInt();
            int[] medicationPrice = {mP1, mP2, mP3};
            System.out.print("Doctor Fee = ");
            int dF = sc.nextInt();
            patientList[j] = new Patient(na, ag, medicationPrice, dF);
        }
        for(int j = 0; j< patientList.length; j++){
            patientList[j].printData();
            System.out.println();
        }

        double totalFeeSum = 0;
        int totalFeeCount = 0;
        for(Patient patient : patientList){
            if (patient.age > 50) {
            totalFeeSum = totalFeeSum + patient.totalFee();
            totalFeeCount++;
            }
        }
        double averageTotalFee = totalFeeSum / totalFeeCount;
        System.out.println("Average Total Fee of Patients Older than 50: " + averageTotalFee);
        
        double smallestMedicationPrice = Double.MAX_VALUE;
        Patient medicationPriceSmallest = null;
        for (Patient patient : patientList){
            if (patient.age >=15 && patient.age <=30) {
                double smp = patient.averageMediactionPrice();
            if (smp < smallestMedicationPrice) {
                smallestMedicationPrice = smp;
                medicationPriceSmallest = patient;
            }
            }
        }
        System.out.println("Smallest Average Medication Price = " + smallestMedicationPrice);
        if (medicationPriceSmallest != null) {
            System.out.println("Data = ");
            medicationPriceSmallest.printData();
        }
    }
}