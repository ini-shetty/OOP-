
class AttendanceException extends Exception {
    AttendanceException(String msg) {
        super(msg);
    }
}

public class Attendance {
    public static void main(String[] args) {
        double attendance = 65;

        try {
            if (attendance < 75) {
                throw new AttendanceException("Insufficient Attendance");
            }

            System.out.println("Eligible for Examination");
        }
        catch (AttendanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
