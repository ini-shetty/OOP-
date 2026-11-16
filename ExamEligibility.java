
class MarksException extends Exception {
    MarksException(String msg) {
        super(msg);
    }
}

public class ExamEligibility {
    public static void main(String[] args) {
        int marks = 30;

        try {
            if (marks < 40) {
                throw new MarksException("Not Eligible for Examination");
            }

            System.out.println("Eligible for Examination");
        }
        catch (MarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
