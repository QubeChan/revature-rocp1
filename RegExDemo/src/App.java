import validators.CarLicensePlate;
import validators.DriversLicense;
import validators.SSN;
import validators.Zipcode;

public class App {
    public static void main(String[] args) {
        SSN social = new SSN();
        System.out.println("007-00-0112 is a valid social: " + social.isValidSSN("007-00-0112")); // output: true
        System.out.println("007-00-01121 is a valid social: " + social.isValidSSN("007-00-01121")); // output: false
        System.out.println("0070-0-1121 is a valid social: " + social.isValidSSN("0070-0-1121")); // output: false

        CarLicensePlate clp = new CarLicensePlate();
        System.out.println("\nMYCAR11 is a valid car license plate: " + clp.isValidCarLicensePlate("MYCAR11")); // output: true
        System.out.println("invalidplate is a valid car license plate: " + clp.isValidCarLicensePlate("invalidplate")); // output: false

        Zipcode zc = new Zipcode();
        System.out.println("\n12345 is a valid zipcode: " + zc.isValidZipCode("12345")); //output: true
        System.out.println("2345 is a valid zipcode: " + zc.isValidZipCode("2345")); // output: false
        System.out.println("1234* is a valid zipcode: " + zc.isValidZipCode("1234*")); // output: false

        DriversLicense dl = new DriversLicense();
        System.out.println("\n123456789 is a valid drivers license: " + dl.isValidDriversLicense("123456789")); //output: true
        System.out.println("23456789 is a valid drivers license: " + dl.isValidDriversLicense("23456789")); // output: false
        System.out.println("1234*6789 is a valid drivers license: " + dl.isValidDriversLicense("1234*6789")); // output: false
    }

}
