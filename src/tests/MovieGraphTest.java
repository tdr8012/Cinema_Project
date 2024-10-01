package tests;

import moviegraph.MovieGraph;
import org.junit.Test;
import reservation.Movie;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieGraphTest {

    @Test
    public void testAddConnection() {
        MovieGraph movieGraph = new MovieGraph();
        Movie movie1 = new Movie("Movie 1", "Genre 1", 120);
        Movie movie2 = new Movie("Movie 2", "Genre 2", 110);

        movieGraph.addMovie(movie1);
        movieGraph.addMovie(movie2);

        movieGraph.addConnection(movie1, movie2);

        List<Movie> relatedMovies1 = movieGraph.getRelatedMovies(movie1);
        List<Movie> relatedMovies2 = movieGraph.getRelatedMovies(movie2);

        assertEquals(1, relatedMovies1.size());
        assertEquals(1, relatedMovies2.size());
        assertEquals(movie2, relatedMovies1.get(0));
        assertEquals(movie1, relatedMovies2.get(0));
    }

    @Test
    public void testAddMovie() {
        MovieGraph movieGraph = new MovieGraph();
        Movie movie1 = new Movie("Movie 1", "Genre 1", 120);

        movieGraph.addMovie(movie1);

        List<Movie> relatedMovies = movieGraph.getRelatedMovies(movie1);

        assertEquals(0, relatedMovies.size());
    }

    @Test
    public void testRemoveMovie() {
        MovieGraph movieGraph = new MovieGraph();
        Movie movie1 = new Movie("Movie 1", "Genre 1", 120);
        Movie movie2 = new Movie("Movie 2", "Genre 2", 110);

        movieGraph.addMovie(movie1);
        movieGraph.addMovie(movie2);
        movieGraph.addConnection(movie1, movie2);

        movieGraph.removeMovie(movie1);

        List<Movie> relatedMovies = movieGraph.getRelatedMovies(movie2);

        assertEquals(0, relatedMovies.size());
    }
}
