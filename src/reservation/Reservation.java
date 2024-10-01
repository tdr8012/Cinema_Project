package reservation;

import user.User;

public class Reservation {
    private Movie movie;
    private String dateTime;
    private int numberOfTickets;
    private User user;

    public Reservation(Movie movie, String dateTime, int numberOfTickets, User user) {
        this.movie = movie;
        this.dateTime = dateTime;
        this.numberOfTickets = numberOfTickets;
        this.user = user;
    }

    // Getters and setters
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // toString method to represent Reservation object as a string
    @Override
    public String toString() {
        return "Reservation{" +
                "movie=" + movie +
                ", dateTime='" + dateTime + '\'' +
                ", numberOfTickets=" + numberOfTickets +
                ", user=" + user +
                '}';
    }
}
