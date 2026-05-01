package model;

import java.math.BigDecimal;

import enums.BookingStatus;

public class Booking {
    User passenger;
    Driver driver;
    String bookingId;
    BookingStatus status;
    String bookingAmount;
    String source;
    String distination;
    Trip trip;
    BigDecimal fare;
    String createdAt;
    String updatedAt;
}
