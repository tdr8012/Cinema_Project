package tests;

import cinema.CinemaHall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CinemaHallTest {

    @Test
    public void testCinemaHallInitialization() {
        CinemaHall cinemaHall = new CinemaHall(1, 50);

        assertEquals(1, cinemaHall.getHallNumber());
        assertEquals(50, cinemaHall.getCapacity());
        assertEquals("1-1", cinemaHall.getSeatLayout()[0][0]);
        assertEquals("1-50", cinemaHall.getSeatLayout()[0][49]);
        assertEquals("50-50", cinemaHall.getSeatLayout()[49][49]);
    }

    @Test
    public void testSetters() {
        CinemaHall cinemaHall = new CinemaHall(1, 50);

        cinemaHall.setHallNumber(2);
        cinemaHall.setCapacity(100);

        assertEquals(2, cinemaHall.getHallNumber());
        assertEquals(100, cinemaHall.getCapacity());
    }

    @Test
    public void testSetSeatLayout() {
        CinemaHall cinemaHall = new CinemaHall(1, 50);
        String[][] newLayout = new String[50][50];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                newLayout[i][j] = String.valueOf(i * 50 + j + 1);
            }
        }

        cinemaHall.setSeatLayout(newLayout);

        assertEquals(newLayout, cinemaHall.getSeatLayout());
    }
}
