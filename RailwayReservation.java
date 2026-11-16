
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String msg) {
        super(msg);
    }
}

class Reservation {
    boolean[] seats = new boolean[10];

    void reserveSeat(int seatNo) throws SeatAlreadyBookedException {

        if (seatNo < 1 || seatNo > 10) {
            throw new IllegalArgumentException("Invalid Seat Number");
        }

        if (seats[seatNo - 1]) {
            throw new SeatAlreadyBookedException("Seat Already Booked");
        }

        seats[seatNo - 1] = true;
        System.out.println("Seat " + seatNo + " Reserved Successfully");
    }
}

public class RailwayReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reservation r = new Reservation();

        try {
            System.out.print("Enter Seat Number: ");
            int seatNo = sc.nextInt();

            r.reserveSeat(seatNo);
        }
        catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Incorrect Input! Enter a valid number.");
        }
        finally {
            System.out.println("Transaction Completed");
            sc.close();
        }
    }
}
                                                                                                                                                                                                                                                                                                                                 