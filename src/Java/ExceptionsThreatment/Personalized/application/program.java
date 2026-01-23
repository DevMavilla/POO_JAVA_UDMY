package Java.ExceptionsThreatment.Personalized.application;

import Java.ExceptionsThreatment.Personalized.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-In date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Check-Out date (dd/MM/yyyy) : ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.print("Error in reservation: Check-Out must be after Check-In date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.print("Reservation: " + reservation + "\n");

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-In date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-Out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }
        }

        sc.close();
    }
}
