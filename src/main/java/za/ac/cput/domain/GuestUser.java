package za.ac.cput.domain;

public class GuestUser extends User {
    private String guestID;

    public GuestUser( String firstName, String lastName, Contact contact) {
        super(null, null, null, firstName, lastName, contact);
        this.guestID = guestID;
    }

    public String getGuestID() {
        return guestID;
    }
}
