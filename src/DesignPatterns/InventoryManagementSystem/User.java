package DesignPatterns.InventoryManagementSystem;
//  User registration , addition to database
public class User {
    private String name;
    private String id;
    private String address;
    private Long mobNo;
    private String emailId;

    public User(String name, String id, String address, Long mobNo, String emailId) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.mobNo = mobNo;
        this.emailId = emailId;
    }
}
