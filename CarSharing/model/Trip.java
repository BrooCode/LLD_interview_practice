package model;

import java.util.List;

public class Trip {
    String tripId;
    Car car;
    Driver driver;
    String source;
    String destination;
    List<String> stops;
    int totalSeats;
    int seatAvailable;
}
