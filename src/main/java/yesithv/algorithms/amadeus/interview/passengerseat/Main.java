package yesithv.algorithms.amadeus.interview.passengerseat;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * You have a list of passengers, each one has a class (ex: First class, Economy).
 * The flight they were going in with LHR destination was canceled.
 * There's a list of flights were each flight has:
 * departure time, destination, and a matrix with the seats indicating the class of the seat
 * (ex: First class, Business) and if they are occupied.
 * Example of the matrix:
 * [[F, X, F, -,F,F,F],
 * [B, X, X, -,B,B,B],
 * [E, X, E, -,E,E,E],
 * [E, E, E, -,X,X,X],
 * [E, E, E, -,E,E,E],]
 * <p>
 * F = First Class
 * B = Business
 * E = Economy
 * X = Occupied
 * <p>
 * There are 2 scenarios:
 * 1) Consider that each passenger is flying alone, assign all passengers to the next available flight heading to LHR
 * 2) Now passengers are in groups and you need to assign the entire group to the same flight, they also need to have continuous seats (if there's an aisle in the middle it's fine, Example [E, -, E] )
 */
public class Main {
    public static void main(String[] args) {
        List<Passenger> passengerList = createPassengerList();
        int passengerIndex = 0;
        int passengerListSize = passengerList.size();

        // Let's consider a single Fly option, not a list of options:
        Flight flight = new Flight();
        for (String[] row : flight.getSeatingClass()) {
            for (String seat : row) {
                if (!seat.equals("X") && !seat.equals("-") && passengerIndex < passengerListSize) {
                    // seat = passengerList.get(passengerIndex).getSeatType().toString();
                    Passenger foundPassenger = new Passenger();
                    for (Passenger passenger : passengerList) {
                        if (seat.equals(passenger.getSeatType().toString())) {
                            seat = seat + " " + passenger.getName();
                            foundPassenger = passenger;
                            break;
                        }
                    }
                    if (foundPassenger.getId() != null) {
                        passengerList.remove(foundPassenger);
                    }

                }
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    public static List<Passenger> createPassengerList() {
        List<Passenger> returnPassengerList = new ArrayList<>();

        Passenger passenger = Passenger.builder()
                .id(UUID.randomUUID())
                .name("Pepito")
                .seatType(SEAT_TYPE.B)
                .build();
        returnPassengerList.add(passenger);
        passenger = new Passenger();

        passenger = Passenger.builder()
                .id(UUID.randomUUID())
                .name("Juanito")
                .seatType(SEAT_TYPE.F)
                .build();
        returnPassengerList.add(passenger);
        passenger = new Passenger();

        passenger = Passenger.builder()
                .id(UUID.randomUUID())
                .name("Martha")
                .seatType(SEAT_TYPE.E)
                .build();
        returnPassengerList.add(passenger);
        passenger = new Passenger();

        passenger = Passenger.builder()
                .id(UUID.randomUUID())
                .name("Maria")
                .seatType(SEAT_TYPE.E)
                .build();
        returnPassengerList.add(passenger);
        passenger = new Passenger();

        passenger = Passenger.builder()
                .id(UUID.randomUUID())
                .name("Esperanza")
                .seatType(SEAT_TYPE.B)
                .build();
        returnPassengerList.add(passenger);
        passenger = new Passenger();

        passenger = Passenger.builder()
                .id(UUID.randomUUID())
                .name("Alberto")
                .seatType(SEAT_TYPE.E)
                .build();
        returnPassengerList.add(passenger);
        passenger = new Passenger();

        passenger = Passenger.builder()
                .id(UUID.randomUUID())
                .name("Esteban")
                .seatType(SEAT_TYPE.E)
                .build();
        returnPassengerList.add(passenger);

        for (Passenger p : returnPassengerList) {
            System.out.println(p.toString());
        }
        return returnPassengerList;
    }
}
