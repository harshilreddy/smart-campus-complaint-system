public class Complaint {

    int id;
    String studentName;
    String category;
    String location;
    String description;
    String status;

    Complaint(int id, String studentName, String category,
              String location, String description) {

        this.id = id;
        this.studentName = studentName;
        this.category = category;
        this.location = location;
        this.description = description;
        this.status = "Pending";
    }

    void displayComplaint() {

        System.out.println("----------------------------");
        System.out.println("Complaint ID : " + id);
        System.out.println("Student Name : " + studentName);
        System.out.println("Category     : " + category);
        System.out.println("Location     : " + location);
        System.out.println("Description  : " + description);
        System.out.println("Status       : " + status);
        System.out.println("----------------------------");
    }
}
