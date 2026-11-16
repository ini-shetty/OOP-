
import java.util.Scanner;

public class EmailOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student email address: ");
        String email = sc.nextLine();

        System.out.println("\nLength of email: " + email.length());

        int at = email.indexOf('@');
        String username = email.substring(0, at);
        System.out.println("Username: " + username);

        
        String domain = email.substring(at + 1);
        System.out.println("Domain: " + domain);

        if (domain.equalsIgnoreCase("bmsce.ac.in")) {
            System.out.println("Belongs to BMSCE Institution");
        } else {
            System.out.println("Does not belong to BMSCE Institution");
        }

        
        String lower = email.toLowerCase();
        System.out.println("Lowercase email: " + lower);

        
        System.out.print("\nEnter registration number prefix: ");
        String prefix = sc.nextLine();

        if (email.startsWith(prefix)) {
            System.out.println("Email starts with the given prefix");
        } else {
            System.out.println("Email does not start with the given prefix");
        }

        if (email.toLowerCase().endsWith("bmsce.ac.in")) {
            System.out.println("Email ends with valid domain");
        } else {
            System.out.println("Email does not end with valid domain");
        }

               String updated = email.replace(
            "bmsce.ac.in", "cse.bmsce.ac.in"
        );
        System.out.println("Updated email: " + updated);

                System.out.print("\nEnter character or sequence to search: ");
        String search = sc.nextLine();

        if (email.contains(search)) {
            System.out.println("Email contains " + search);
        } else {
            System.out.println("Email does not contain " + search);
        }

        
        String trimmed = email.trim();
        System.out.println("Trimmed email: " + trimmed);

                System.out.print("\nEnter another email address: ");
        String email2 = sc.nextLine();

        if (email.equalsIgnoreCase(email2)) {
            System.out.println("Both email addresses are identical");
        } else {
            System.out.println("Email addresses are different");
        }

        sc.close();
    }
}
