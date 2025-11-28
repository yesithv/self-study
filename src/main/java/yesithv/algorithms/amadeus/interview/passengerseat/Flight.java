package yesithv.algorithms.amadeus.interview.passengerseat;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Flight {
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String[][] seatingClass;

    public Flight() {
        this.departureTime = LocalDateTime.now();
        this.arrivalTime = LocalDateTime.now().plusHours(2);

        this.seatingClass = new String[][]{
                {"F", "X", "F", "-", "F", "F", "F"},
                {"B", "X", "X", "-", "B", "B", "B"},
                {"E", "X", "E", "-", "E", "E", "E"},
                {"E", "E", "E", "-", "X", "X", "X"},
                {"E", "E", "E", "-", "E", "E", "E"}
        };

    }
}

