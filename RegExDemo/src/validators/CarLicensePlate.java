package validators;

public class CarLicensePlate {
    public boolean isValidCarLicensePlate(String dl){
        if (dl.matches("[0-9A-Z]{6,7}")){ // at least 6 but at most 7 alphanumeric
            return true;
        }else{
            return false;
        }
    }
}
