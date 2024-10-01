import cinema.CinemaHall;
import moviegraph.MovieGraph;
import reservation.Movie;
import reservation.Rating;
import reservation.Reservation;
import reservation.ReservationSystem;
import showtime.Showtime;
import user.User;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        // Create an instance of the reservation system
//        reservation.ReservationSystem = new reservation.ReservationSystem();
//
//        // Assume we have some movies and a user
//        reservation.Movie movie1 = new reservation.Movie("reservation.Movie 1", "Action", 120);
//        reservation.Movie movie2 = new reservation.Movie("reservation.Movie 2", "Comedy", 110);
//        reservation.Movie movie3 = new reservation.Movie("reservation.Movie 3", "Drama", 130);
//
//        // Rate some movies
//        reservationSystem.rateMovie(movie1, 4.5, "Great action movie!");
//        reservationSystem.rateMovie(movie2, 3.8, "Funny comedy film");
//        reservationSystem.rateMovie(movie3, 4.2, "Interesting drama");
//
//        // Create a user with an appropriate age
//        user.User user = new user.User("John", 30); // Assuming the user is 30 years old
//        user.addPreference("Action"); // user.User prefers action movies
//
//        // Get recommendations based on user preferences and age
//        List<reservation.Movie> recommendations = reservationSystem.recommendMovies(user);
//
//        // Print the recommended movies
//        if (recommendations.isEmpty()) {
//            System.out.println("No recommendations available.");
//        } else {
//            System.out.println("Recommended movies for " + user.getName() + ":");
//            for (reservation.Movie movie : recommendations) {
//                System.out.println(movie.getTitle());
//            }
//        }

        // Create a movie
        Movie movie1 = new Movie("Avengers: Endgame", "Action", 180);
        // Create another movie
        Movie movie2 = new Movie("Inception", "Sci-Fi", 150);
        Movie movie3 = new Movie("2012", "Action", 200);

        CinemaHall cinemaHall1 = new CinemaHall(1, 100); // Example cinema hall
        Date startTime = new Date(); // Example start time (current time)
        Date endTime = new Date(startTime.getTime() + 2 * 60 * 60 * 1000); // Example end time (2 hours later)
        Showtime showtime1 = new Showtime(movie1, startTime, endTime, cinemaHall1);

        ReservationSystem reservationSystem = new ReservationSystem();



        // Create a user with an appropriate age
        User user1 = new User("Dara", 37); // Assuming the user is 30 years old
        user1.addPreference("Action"); // user.User prefers action movies

        Reservation reservation1 = new Reservation(movie1, "2024-03-20 15:00", 2, user1);


        // Make the reservation
        reservationSystem.makeReservation(reservation1);

        // Assuming a reservation is made already
        reservationSystem.cancelLastReservation();


        // Rate the movie
        reservationSystem.rateMovie(movie2, 4.8, "Mind-bending plot!");
        reservationSystem.rateMovie(movie3, 4.5, "Foreshadowing?!");
        reservationSystem.rateMovie(movie1, 5.0, "Best marvel movie ever!");

        // Assuming the movie "Inception" is already rated
        Rating movieRating = reservationSystem.getRatingForMovie(movie2);
        System.out.println("reservation.Rating for 'Inception': " + movieRating.calculateAverageRating());


        // Assuming we have a user with preferences and age
        user1.addPreference("Action");


// Get recommendations based on user preferences and age
        List<Movie> recommendations = reservationSystem.recommendMovies(user1);

// Print the recommended movies
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations available.");
        } else {
            System.out.println("Recommended movies for " + user1.getName() + ":");
            for (Movie movie : recommendations) {
                System.out.println(movie.getTitle());
            }
        }

        // Integrate moviegraph.MovieGraph functionality
        MovieGraph movieGraph = new MovieGraph();
        movieGraph.addConnection(movie1, movie2);

        // Retrieve related movies
        List<Movie> relatedMovies = movieGraph.getRelatedMovies(movie1);
        System.out.println("Related movies for " + movie1.getTitle() + ":");
        for (Movie movie : relatedMovies) {
            System.out.println(movie.getTitle());
        }


    }
}
