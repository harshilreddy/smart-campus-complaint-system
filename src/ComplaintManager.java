import java.util.*;

public class ComplaintManager {

    ArrayList<Complaint> complaints = new ArrayList<>();

    void addComplaint(Complaint complaint) {
        complaints.add(complaint);
    }
    int getNextId() {
    return complaints.size() + 1;
}

    void viewAllComplaints() {

        if (complaints.size() == 0) {
            System.out.println("No complaints found.");
            return;
        }

        for (Complaint complaint : complaints) {
            complaint.displayComplaint();
        }
    }
}
