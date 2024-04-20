package za.ac.cput.domain;

public class Admin extends User{
    private String role;
    public Admin(String userID, String username, String password, String firstName, String lastName, Contact contact) {
        super(userID, username, password, firstName, lastName, contact);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "role='" + role + '\'' +
                '}';
    }
}
