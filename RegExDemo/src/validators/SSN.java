package validators;

public class SSN {

    public boolean isValidSSN(String ssn) {
        if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
            return true;
        } else {
            return false;
        }
    }
}
