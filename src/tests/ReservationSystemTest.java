package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import reservation.Movie;
import reservation.Reservation;
import reservation.ReservationSystem;
import user.User;

public class ReservationSystemTest {
    private ReservationSystem reservationSystem;
    private Movie movie1;
    private User user1;

    @Before
    public void setUp() {
        reservationSystem = new ReservationSystem();
        movie1 = new Movie("Avengers: Endgame", "Action", 180);
        user1 = new User("Dara", 30);
        user1.addPreference("Action");
    }

    @Test
    public void testMakeReservation() {
        Reservation reservation = new Reservation(movie1, "2024-03-20 15:00", 2, user1);
        reservationSystem.makeReservation(reservation);
        assertTrue(reservationSystem.getReservations().contains(reservation));
    }

    @Test
    public void testCancelReservation() {
        Reservation reservation = new Reservation(movie1, "2024-03-20 15:00", 2, user1);
        reservationSystem.makeReservation(reservation);
        reservationSystem.cancelLastReservation();
        assertFalse(reservationSystem.getReservations().contains(reservation));
    }

    @Test
    public void testRateMovie() {
        Reservation reservation = new Reservation(movie1, "2024-03-20 15:00", 2, user1);
        reservationSystem.makeReservation(reservation);
        reservationSystem.rateMovie(movie1, 4.5, "Awesome movie!");
        assertEquals(1, reservationSystem.getMovieRatings().size());
        assertNotNull(reservationSystem.getMovieRatings().get(movie1));
    }
}
