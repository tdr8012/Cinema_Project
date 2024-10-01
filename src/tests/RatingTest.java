package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import reservation.Movie;
import reservation.Rating;

public class RatingTest {
    private Movie movie;
    private Rating rating;

    @Before
    public void setUp() {
        movie = new Movie("Test Movie", "Test Genre", 120);
        rating = new Rating(movie);
    }

    @Test
    public void testAddRatingAndComment() {
        rating.addRating(4.5, "Great movie!");
        assertEquals(1, rating.getRatings().size());
        assertEquals("Great movie!", rating.getComments().get(0));
    }

    @Test
    public void testCalculateAverageRating() {
        rating.addRating(4.5, "Great movie!");
        rating.addRating(3.0, "Average movie");
        assertEquals(3.75, rating.calculateAverageRating(), 0.01); // Delta is used to allow for floating-point comparison
    }
}
