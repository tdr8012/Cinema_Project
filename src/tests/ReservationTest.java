package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import reservation.Movie;
import reservation.Reservation;
import user.User;

public class ReservationTest {

    @Test
    public void testReservationCreation() {
        Movie movie = new Movie("Test Movie", "Action", 120);
        User user = new User("John Doe", 25);
        Reservation reservation = new Reservation(movie, "2024-03-20", 2, user);

        assertEquals(movie, reservation.getMovie());
        assertEquals("2024-03-20", reservation.getDateTime());
        assertEquals(2, reservation.getNumberOfTickets());
        assertEquals(user, reservation.getUser());
    }

    @Test
    public void testSetterMethods() {
        Movie movie = new Movie("Test Movie", "Action", 120);
        User user = new User("John Doe", 25);
        Reservation reservation = new Reservation(movie, "2024-03-20", 2, user);

        Movie newMovie = new Movie("New Movie", "Comedy", 90);
        User newUser = new User("Jane Smith", 30);

        reservation.setMovie(newMovie);
        reservation.setDateTime("2024-03-21");
        reservation.setNumberOfTickets(3);
        reservation.setUser(newUser);

        assertEquals(newMovie, reservation.getMovie());
        assertEquals("2024-03-21", reservation.getDateTime());
        assertEquals(3, reservation.getNumberOfTickets());
        assertEquals(newUser, reservation.getUser());
    }
}
