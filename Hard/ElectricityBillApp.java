package Hard;

import java.util.Scanner;

class ElectricityBill {
    private String consumerNo;
    private String consumerName;
    private double previousMonthReading;
    private double currentMonthReading;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Consumer Number: ");
        consumerNo = scanner.nextLine();
        System.out.print("Enter Consumer Name: ");
        consumerName = scanner.nextLine();
        System.out.print("Enter Previous Month Reading: ");
        previousMonthReading = scanner.nextDouble();
        System.out.print("Enter Current Month Reading: ");
        currentMonthReading = scanner.nextDouble();
    }

    public double calculateBill() {
        double unitsConsumed = currentMonthReading - previousMonthReading;
        double billAmount = 0;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1;
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 1 + (unitsConsumed - 100) * 2.5;
        } else if (unitsConsumed <= 500) {
            billAmount = 100 * 1 + 100 * 2.5 + (unitsConsumed - 200) * 4;
        } else {
            billAmount = 100 * 1 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
        }

        return billAmount;
    }

    public void displayBill() {
        double billAmount = calculateBill();
        System.out.println("\nElectricity Bill");
        System.out.println("Consumer Number: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + (currentMonthReading - previousMonthReading));
        System.out.printf("Total Bill Amount: Rs. %.2f\n", billAmount);
    }
}

public class ElectricityBillApp {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill();
        bill.inputDetails();
        bill.displayBill();
    }
}

