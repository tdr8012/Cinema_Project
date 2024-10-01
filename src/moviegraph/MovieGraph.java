package moviegraph;

import reservation.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieGraph {
    private Map<Movie, List<Movie>> movieConnections;

    public MovieGraph() {
        this.movieConnections = new HashMap<>();
    }

    // Method to add a connection between two movies
    public void addConnection(Movie movie1, Movie movie2) {
        movieConnections.computeIfAbsent(movie1, k -> new ArrayList<>()).add(movie2);
        movieConnections.computeIfAbsent(movie2, k -> new ArrayList<>()).add(movie1);
    }

    // Method to get movies related to a given movie
    public List<Movie> getRelatedMovies(Movie movie) {
        return movieConnections.getOrDefault(movie, new ArrayList<>());
    }

    // Method to add a movie to the graph
    public void addMovie(Movie movie) {
        if (!movieConnections.containsKey(movie)) {
            movieConnections.put(movie, new ArrayList<>());
        }
    }

    // Method to remove a movie from the graph
    public void removeMovie(Movie movie) {
        movieConnections.remove(movie);
        movieConnections.forEach((k, v) -> v.remove(movie));
    }

    // Method to get adjacent movies for a given movie
    public List<Movie> getAdjacentMovies(Movie movie) {
        return movieConnections.getOrDefault(movie, new ArrayList<>());
    }

    // Other methods for managing movie connections...
}
