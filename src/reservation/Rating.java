package reservation;

import reservation.Movie;

import java.util.ArrayList;
import java.util.List;

public class Rating {
    private Movie movie;
    private List<Double> ratings;
    private List<String> comments;

    public Rating(Movie movie) {
        this.movie = movie;
        this.ratings = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    // Method to add a rating and comment
    public void addRating(double rating, String comment) {
        ratings.add(rating);
        comments.add(comment);
    }

    // Method to calculate the average rating
    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0; // No ratings yet
        }

        double sum = 0.0;
        for (double rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }

    // Getters
    public Movie getMovie() {
        return movie;
    }

    public List<Double> getRatings() {
        return ratings;
    }

    public List<String> getComments() {
        return comments;
    }

    // toString method to represent reservation.Rating object as a string
    @Override
    public String toString() {
        return "reservation.Rating{" +
                "movie=" + movie +
                ", ratings=" + ratings +
                ", comments=" + comments +
                '}';
    }
}
