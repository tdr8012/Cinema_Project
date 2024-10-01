package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import reservation.Movie;
import reservation.Ticket;
import showtime.Showtime;
import user.User;

import java.util.Date;

public class TicketTest {

    @Test
    public void testTicketCreation() {
        Movie movie = new Movie("Test Movie", "Action", 120);
        User user = new User("John Doe", 25);

        // Creating Date objects for startTime and endTime
        Date startTime = new Date();
        Date endTime = new Date();

        Showtime showtime = new Showtime(movie, startTime, endTime, null);
        Ticket ticket = new Ticket(showtime, 1, 10.0);

        assertEquals(showtime, ticket.getShowtime());
        // Add assertions for seatNumber and price as needed
    }

    @Test
    public void testSetterMethods() {
        Movie movie = new Movie("Test Movie", "Action", 120);
        User user = new User("John Doe", 25);

        // Creating Date objects for startTime and endTime
        Date startTime = new Date();
        Date endTime = new Date();

        Showtime showtime = new Showtime(movie, startTime, endTime, null);
        Ticket ticket = new Ticket(showtime, 1, 10.0);

        // Creating a new Showtime instance
        Showtime newShowtime = new Showtime(movie, startTime, endTime, null);

        ticket.setShowtime(newShowtime);
        ticket.setSeatNumber(2);
        ticket.setPrice(15.0);

        assertEquals(newShowtime, ticket.getShowtime());
        // Add assertions for seatNumber and price as needed
    }
}
