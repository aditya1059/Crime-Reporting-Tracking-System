package dao;

import model.Complaint;
import utils.DBHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComplaintDAO {
    public void fileComplaint(Complaint c){
        String query = "INSERT INTO complaints (title, description, location, userId) VALUES (?, ?, ?, ?)";
        Connection con = DBHelper.getConnection();

        try (Statement st= Objects.requireNonNull(con).createStatement();
             PreparedStatement pst = Objects.requireNonNull(con).prepareStatement(query)) {
            st.execute("use crime_tracking");
            pst.setString(1, c.getTitle());
            pst.setString(2, c.getDescription());
            pst.setString(3, c.getLocation());
            //pst.setDate(4, (Date) c.getReported());
            pst.setInt(4, c.getUserId());
            pst.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Getting problem in "+e);
        }
    }
    public List<Complaint> getAllComplaints() throws SQLException {
        List<Complaint> list = new ArrayList<>();
        String query = "SELECT * FROM complaints";
        try (Connection con = DBHelper.getConnection();
             Statement st = Objects.requireNonNull(con).createStatement();
             ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                Complaint c = new Complaint();
                c.setId(rs.getInt("id"));
                c.setTitle(rs.getString("title"));
                c.setDescription(rs.getString("description"));
                c.setLocation(rs.getString("location"));
                c.setDateReported(rs.getDate("date_reported"));
                c.setStatus(rs.getString("status"));
                c.setUserId(rs.getInt("user_id"));
                list.add(c);
            }
        }
        return list;
    }

    // add updateStatus(), searchByLocation(), etc.
}
