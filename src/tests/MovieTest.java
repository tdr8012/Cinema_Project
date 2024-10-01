import org.junit.Before;
import org.junit.Test;
import reservation.Movie;

import static org.junit.Assert.*;

public class MovieTest {
    private Movie movie;

    @Before
    public void setUp() {
        // Initialize a Movie object for testing
        movie = new Movie("Avengers: Endgame", "Action", 180);
    }

    @Test
    public void testConstructor() {
        // Test if the Movie object is constructed correctly
        assertEquals("Avengers: Endgame", movie.getTitle());
        assertEquals("Action", movie.getGenre());
        assertEquals(180, movie.getDuration());
    }

    @Test
    public void testGetTitle() {
        // Test the getTitle method
        assertEquals("Avengers: Endgame", movie.getTitle());
    }

    @Test
    public void testGetGenre() {
        // Test the getGenre method
        assertEquals("Action", movie.getGenre());
    }

    @Test
    public void testGetDuration() {
        // Test the getDuration method
        assertEquals(180, movie.getDuration());
    }

    @Test
    public void testSetTitle() {
        // Test the setTitle method
        movie.setTitle("Inception");
        assertEquals("Inception", movie.getTitle());
    }

    @Test
    public void testSetGenre() {
        // Test the setGenre method
        movie.setGenre("Sci-Fi");
        assertEquals("Sci-Fi", movie.getGenre());
    }

    @Test
    public void testSetDuration() {
        // Test the setDuration method
        movie.setDuration(150);
        assertEquals(150, movie.getDuration());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidParameters() {
        // Test for invalid parameters in the constructor
        Movie invalidMovie = new Movie("", "Action", 180); // Empty title
    }


//    @Test
//    public void testEquality() {
//        // Test for equality between two Movie objects with the same attributes
//        Movie movie1 = new Movie("Avengers: Endgame", "Action", 180);
//        Movie movie2 = new Movie("Avengers: Endgame", "Action", 180);
//        assertTrue(movie1.equals(movie2));
//        assertTrue(movie2.equals(movie1));
//        assertEquals(movie1.hashCode(), movie2.hashCode());
//    }

    @Test
    public void testInequality() {
        // Test for inequality between two Movie objects with different attributes
        Movie movie1 = new Movie("Avengers: Endgame", "Action", 180);
        Movie movie2 = new Movie("Inception", "Sci-Fi", 150);
        assertFalse(movie1.equals(movie2));
        assertFalse(movie2.equals(movie1));
    }

    @Test
    public void testModifyMovie() {
        // Test for modifying a Movie object
        movie.setTitle("The Dark Knight");
        movie.setGenre("Action");
        movie.setDuration(152);
        assertEquals("The Dark Knight", movie.getTitle());
        assertEquals("Action", movie.getGenre());
        assertEquals(152, movie.getDuration());
    }
}
