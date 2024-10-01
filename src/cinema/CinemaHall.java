package cinema;

public class CinemaHall {
    private int hallNumber;
    private int capacity;
    private String[][] seatLayout; // Represented as a 2D array for seat selection

    public CinemaHall(int hallNumber, int capacity) {
        this.hallNumber = hallNumber;
        this.capacity = capacity;
        this.seatLayout = new String[capacity][capacity]; // Assuming square layout for simplicity
        initializeSeatLayout();
    }

    // Initialize seat layout with seat numbers
    private void initializeSeatLayout() {
        for (int i = 0; i < capacity; i++) {
            for (int j = 0; j < capacity; j++) {
                seatLayout[i][j] = String.format("%d-%d", i + 1, j + 1); // Seat numbers start from 1
            }
        }
    }

    // Getters and setters
    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String[][] getSeatLayout() {
        return seatLayout;
    }

    public void setSeatLayout(String[][] seatLayout) {
        this.seatLayout = seatLayout;
    }

    // toString method to represent cinema.CinemaHall object as a string
    @Override
    public String toString() {
        return "cinema.CinemaHall{" +
                "hallNumber=" + hallNumber +
                ", capacity=" + capacity +
                '}';
    }
}
