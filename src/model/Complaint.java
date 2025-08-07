package model;



import java.sql.Date;

public class Complaint {
    private int id;
    private String title;
    private String description;
    private String location;
    private Date dateReported;
    private String status;
    private int userId;

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLocation() {
        return this.location;
    }

    public java.util.Date getReported() {
        return this.dateReported;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setId(int id) {
        this.id=id;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public void setLocation(String location) {
        this.location=location;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported=dateReported;
    }

    public void setStatus(String status) {
        this.status=status;
    }

    public void setUserId(int userId) {
        this.userId=userId;
    }

    // Constructors, Getters, Setters
}
