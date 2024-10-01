package reservation;

import user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ReservationSystem {
    private Stack<Reservation> reservationStack;
    private Map<Movie, Rating> movieRatings;
    private List<Reservation> reservations;

    public ReservationSystem() {
        this.reservationStack = new Stack<>();
        this.movieRatings = new HashMap<>();
        this.reservations = new ArrayList<>();
    }

    // Method to make a reservation
    public void makeReservation(Reservation reservation) {
        reservationStack.push(reservation);
        reservations.add(reservation);
    }


    // Method to cancel the last reservation
    public void cancelLastReservation() {
        if (!reservationStack.isEmpty()) {
            Reservation lastReservation = reservationStack.pop();
            reservations.remove(lastReservation);
        }
    }


    // Method to recommend movies based on user preferences and age
    public List<Movie> recommendMovies(User user) {
        List<Movie> recommendedMovies = new ArrayList<>();

        // Collect user preferences (e.g., favorite genres)
        List<String> userPreferences = user.getPreferences();
        int userAge = user.getAge();

        // Analyze movie ratings to identify popular movies or movies with high ratings
        for (Movie movie : movieRatings.keySet()) {
            Rating rating = movieRatings.get(movie);
            if (rating == null || rating.calculateAverageRating() >= 4.0) { // Consider highly-rated movies or unrated movies
                if (userPreferences.contains(movie.getGenre())) { // Check if the movie genre matches user preferences
                    // Age-based recommendation: Check if the movie is suitable for the user's age
                    if (isSuitableForAge(movie, userAge)) {
                        recommendedMovies.add(movie);
                    }
                }
            }
        }

        return recommendedMovies;
    }

    // Getter for reservations
    public List<Reservation> getReservations() {
        return reservations;
    }

    // Getter for movie ratings
    public Map<Movie, Rating> getMovieRatings() {
        return movieRatings;
    }


    // Method to check if a movie is suitable for the user's age
    private boolean isSuitableForAge(Movie movie, int userAge) {
        // Example: Consider movies suitable for ages 12 and above
        return userAge >= 12;
    }

    // Method to rate a movie
    public void rateMovie(Movie movie, double rating, String comment) {
        Rating movieRating = movieRatings.getOrDefault(movie, new Rating(movie));
        movieRating.addRating(rating, comment);
        movieRatings.put(movie, movieRating);
    }

    // Method to get rating for a movie
    public Rating getRatingForMovie(Movie movie) {
        return movieRatings.getOrDefault(movie, new Rating(movie));
    }
}
