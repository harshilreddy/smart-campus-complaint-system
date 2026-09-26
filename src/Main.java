import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ComplaintManager manager = new ComplaintManager();

        int choice;

        do {
            System.out.println("\n======================================");
            System.out.println("   SMART CAMPUS COMPLAINT SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Add Complaint");
            System.out.println("2. View All Complaints");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Category: ");
                String category = sc.nextLine();

                System.out.print("Enter Location: ");
                String location = sc.nextLine();

                System.out.print("Enter Complaint: ");
                String description = sc.nextLine();

                Complaint complaint = new Complaint(
                      1000 + manager.getNextId(),
                        name,
                        category,
                        location,
                        description
                );

                manager.addComplaint(complaint);

                System.out.println("\nComplaint added successfully!");

            } 
            else if (choice == 2) {

                manager.viewAllComplaints();

            } 
            else if (choice == 3) {

                System.out.println("Thank you for using the system!");

            } 
            else {

                System.out.println("Invalid choice!");

            }

        } while (choice != 3);

        sc.close();
    }
}
