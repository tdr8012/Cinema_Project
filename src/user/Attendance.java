package user;

import showtime.Showtime;

import java.util.HashMap;
import java.util.Map;

public class Attendance {
    private Map<Showtime, Integer> ticketsSold;

    public Attendance() {
        this.ticketsSold = new HashMap<>();
    }

    // Method to update attendance for a specific showtime
    public void updateAttendance(Showtime showtime, int ticketsSold) {
        this.ticketsSold.put(showtime, ticketsSold);
    }

    // Method to get tickets sold for a specific showtime
    public int getTicketsSold(Showtime showtime) {
        return ticketsSold.getOrDefault(showtime, 0);
    }

    // toString method to represent user.Attendance object as a string
    @Override
    public String toString() {
        return "user.Attendance{" +
                "ticketsSold=" + ticketsSold +
                '}';
    }
}
