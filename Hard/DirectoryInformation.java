package Hard;

import java.util.Scanner;

class Person {
    String name;
    String address;
    String telephone;
    String mobile;
    String headOfFamily;
    String uniqueID;

    Person(String name, String address, String telephone, String mobile, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    void displayDirectory() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone: " + (telephone.isEmpty() ? "N/A" : telephone));
        System.out.println("Mobile: " + (mobile.isEmpty() ? "N/A" : mobile));
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueID);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Telephone (optional): ");
        String telephone = sc.nextLine();
        System.out.print("Enter Mobile (optional): ");
        String mobile = sc.nextLine();
        System.out.print("Enter Head of Family: ");
        String headOfFamily = sc.nextLine();
        System.out.print("Enter Unique ID: ");
        String uniqueID = sc.nextLine();

        Person p = new Person(name, address, telephone, mobile, headOfFamily, uniqueID);
        p.displayDirectory();
        sc.close();
    }
}

