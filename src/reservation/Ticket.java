package reservation;

import showtime.Showtime;
import user.User;

public class Ticket {
    private Showtime showtime;
    private int seatNumber;
    private double price;

    public Ticket(Showtime showtime, int seatNumber, double price) {
        this.showtime = showtime;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Getters and setters
    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method to represent reservation.Ticket object as a string
    @Override
    public String toString() {
        return "reservation.Ticket{" +
                "showtime=" + showtime +
                ", seatNumber=" + seatNumber +
                ", price=" + price +
                '}';
    }
}
