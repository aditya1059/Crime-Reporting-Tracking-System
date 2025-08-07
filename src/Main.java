import dao.ComplaintDAO;
import model.Complaint;

import java.sql.Connection;
import java.sql.Date;
import java.util.Scanner;

import static utils.DBHelper.getConnection;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplaintDAO dao = new ComplaintDAO();

        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter description: ");
        String desc = sc.nextLine();
        System.out.print("Enter location: ");
        String loc = sc.nextLine();

        Complaint c = new Complaint();
        c.setTitle(title);
        c.setDescription(desc);
        c.setLocation(loc);
       // c.setDateReported(new Date());
        c.setUserId(1); // public user

        dao.fileComplaint(c);
        System.out.println("Complaint filed successfully.");

    }
}