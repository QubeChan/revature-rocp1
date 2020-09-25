package validators;

public class DriversLicense {

    public boolean isValidDriversLicense(String dl){
        if (dl.matches("[0-9]{9}")){ // 9 numbers
            return true;
        }else{
            return false;
        }
    }
}
