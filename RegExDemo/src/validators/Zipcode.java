package validators;

public class Zipcode {
    public boolean isValidZipCode(String zipcode){
        if (zipcode.matches("[0-9]{5}")){ // at least 5 numbers
            return true;
        }else{
            return false;
        }
    }
}
