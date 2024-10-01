package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import reservation.Movie;
import showtime.Showtime;
import cinema.CinemaHall;

import java.util.Date;

public class ShowtimeTest {

    @Test
    public void testShowtimeCreation() {
        Movie movie = new Movie("Test Movie", "Action", 120);
        Date startTime = new Date();
        Date endTime = new Date();
        CinemaHall cinemaHall = new CinemaHall(1, 100);

        Showtime showtime = new Showtime(movie, startTime, endTime, cinemaHall);

        assertEquals(movie, showtime.getMovie());
        assertEquals(startTime, showtime.getStartTime());
        assertEquals(endTime, showtime.getEndTime());
        assertEquals(cinemaHall, showtime.getCinemaHall());
    }

}
