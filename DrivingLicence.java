
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class DrivingLicence {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new AgeException("Not Eligible for Driving Licence");
            }

            System.out.println("Eligible for Driving Licence");
        }
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
