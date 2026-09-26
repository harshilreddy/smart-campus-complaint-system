import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("   SMART CAMPUS COMPLAINT SYSTEM");
        System.out.println("======================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Complaint: ");
        String description = sc.nextLine();

        Complaint complaint = new Complaint(
                1001,
                name,
                category,
                location,
                description
        );

        System.out.println("\nComplaint Added Successfully!\n");

        complaint.displayComplaint();

        sc.close();
    }
}
