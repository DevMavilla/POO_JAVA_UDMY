package Java.ExceptionsThreatment.Personalized.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkout;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkout) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            return ("Reservation dates for updates must be future dates");
        }
        if (!checkOut.after(checkIn)) {
            return ("Check-Out must be after Check-In date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkout;
        return null;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-In: "
                + sdf.format(checkIn)
                + ", check-Out"
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights"
                + "Diego" + "Avila" + "22/01/2026";
    }

}
