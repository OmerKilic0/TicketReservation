import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Flight flight = new Flight();

        Arrays.fill(flight.getPassengerList(), "Not reserved...");

        int choice;
        do {
            System.out.println("Please select an option:");
            System.out.println("1. Reserve a ticket.");
            System.out.println("2. Cancel a reservation.");
            System.out.println("3. Check whether a ticket is reserved for a particular person.");
            System.out.println("4. Display flight no and list of the passengers.");
            System.out.println("5. Exit");
            choice = Integer.parseInt(scan.nextLine());

            if(choice == 1){
                System.out.print("Enter your name for reservation: ");
                String passengerName = scan.nextLine();
                flight.reserveSeat(passengerName);
            }
            else if (choice == 2) {
                System.out.print("Enter your name to cancel reservation: ");
                String removePassenger = scan.nextLine();
                flight.cancelReservation(removePassenger);
            }
            else if (choice == 3) {
                System.out.print("Enter your name to search your ticket and seat: ");
                String searchPassenger = scan.nextLine();
                flight.searchPassenger(searchPassenger);
            }
            else if (choice == 4) {
                flight.printPassengers();
            }

        } while (choice != 5);

    }
}