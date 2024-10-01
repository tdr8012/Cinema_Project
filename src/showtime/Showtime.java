package showtime;

import cinema.CinemaHall;
import reservation.Movie;

import java.util.Date;

public class Showtime {
    private Movie movie;
    private Date startTime;
    private Date endTime;
    private CinemaHall cinemaHall;

    public Showtime(Movie movie, Date startTime, Date endTime, CinemaHall cinemaHall) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.cinemaHall = cinemaHall;
    }

    // Getters and setters
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    // toString method to represent showtime.Showtime object as a string
    @Override
    public String toString() {
        return "showtime.Showtime{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", cinemaHall=" + cinemaHall +
                '}';
    }
}
