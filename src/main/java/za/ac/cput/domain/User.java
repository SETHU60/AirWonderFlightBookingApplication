package za.ac.cput.domain;

public class User {
  private String UserID;
  private String Username;
  private String password;
  private String firstName;
  private String lastName;
  private Contact contact;

  public User(String userID, String username, String password, String firstName, String lastName, Contact contact) {
    UserID = userID;
    Username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.contact = contact;
  }

  public String getUserID() {
    return UserID;
  }

  public String getUsername() {
    return Username;
  }

  public String getPassword() {
    return password;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Contact getContact() {
    return contact;
  }

  @Override
  public String toString() {
    return "User{" +
            "UserID='" + UserID + '\'' +
            ", Username='" + Username + '\'' +
            ", password='" + password + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", contact=" + contact +
            '}';
  }
}
