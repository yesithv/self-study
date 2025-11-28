package yesithv.algorithms.amadeus.interview.passengerseat;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
    private UUID id;
    private String name;
    private SEAT_TYPE seatType;
}
