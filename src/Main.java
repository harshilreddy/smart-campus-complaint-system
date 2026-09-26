import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" SMART CAMPUS COMPLAINT SYSTEM");
        System.out.println("======================================");

        System.out.println("1. Add Complaint");
        System.out.println("2. View All Complaints");
        System.out.println("3. Search Complaint");
        System.out.println("4. Update Complaint Status");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Add Complaint selected");
        } 
        else if (choice == 2) {
            System.out.println("View Complaints selected");
        } 
        else if (choice == 3) {
            System.out.println("Search Complaint selected");
        } 
        else if (choice == 4) {
            System.out.println("Update Status selected");
        } 
        else if (choice == 5) {
            System.out.println("Thank you!");
        } 
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
