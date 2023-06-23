import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    @Test
    @DisplayName("Contact ID cannot have more than 10 characters")
    void testContactIDWithMoreThanTenCharacters() {
        Contact contact = new Contact("8675309", "FirstName", "LastName", "PhoneNumber", "Address");
        if (contact.getContactID().length() > 10) {
            fail("Contact ID has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Contact First Name cannot have more than 10 characters")
    void testContactFirstNameWithMoreThanTenCharacters() {
        Contact contact = new Contact("ID", "Daniel", "LastName", "PhoneNumber", "Address");
        if (contact.getFirstName().length() > 10) {
            fail("First Name has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Contact Last Name cannot have more than 10 characters")
    void testContactLastNameWithMoreThanTenCharacters() {
        Contact contact = new Contact("ID", "FirstName", "Anderson", "PhoneNumber", "Address");
        if (contact.getLastName().length() > 10) {
            fail("Last Name has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Contact phone number is exactly 10 characters")
    void testContactNumberWithMoreThanTenCharacters() {
        Contact contact = new Contact("ID", "FirstName", "LastName", "2549522036", "Address");
        if (contact.getPhoneNumber().length() != 10) {
            fail("Phone number length does not equal 10.");
        }
    }

    @Test
    @DisplayName("Contact address cannot have more than 30 characters")
    void testContactAddressWithMoreThanThirtyCharacters() {
        Contact contact = new Contact("ID", "FirstName", "LastName", "PhoneNumbr", "42 Wallaby Way"
                + "123456789 is another nine characters long");
        if (contact.getAddress().length() > 30) {
            fail("Address has more than 30 characters.");
        }
    }

    @Test
    @DisplayName("Contact First Name shall not be null")
    void testContactFirstNameNotNull() {
        Contact contact = new Contact(null, null, null, null, null);
        assertNotNull(contact.getFirstName(), "First name was not null.");
    }

    @Test
    @DisplayName("Contact Last Name shall not be null")
    void testContactLastNameNotNull() {
        Contact contact = new Contact(null, null, null, null, null);
        assertNotNull(contact.getLastName(), "Last name was null.");
    }

    @Test
    @DisplayName("Contact Phone Number shall not be null")
    void testContactPhoneNotNull() {
        Contact contact = new Contact("ID", "FirstName", "LastName", null, "Address");
        assertNotNull(contact.getPhoneNumber(), "Phone number was null.");
    }

    @Test
    @DisplayName("Contact Address shall not be null")
    void testContactAddressNotNull() {
        Contact contact = new Contact(null, null, null, null, null);
        assertNotNull(contact.getAddress(), "Address was null.");
    }
}