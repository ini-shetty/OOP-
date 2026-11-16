
class SalaryException extends Exception {
    SalaryException(String msg) {
        super(msg);
    }
}

public class BankLoan {
    public static void main(String[] args) {
        double salary = 12000;

        try {
            if (salary < 15000) {
                throw new SalaryException("Loan Application Rejected");
            }

            System.out.println("Loan Application Approved");
        }
        catch (SalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
