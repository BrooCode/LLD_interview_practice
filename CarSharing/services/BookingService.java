package services;

import model.Driver;

import model.Booking;
import model.User;
import strategy.DriverFindStrategy;

public class BookingService {

    public BookingService() {
        //TODO Auto-generated constructor stub
    }

    

    public Booking createBooking(User user,Driver driver) {
        // 1. Create initial booking with REQUESTED state
        // 2. Use strategy to find drivers
        // 3. Notify drivers
        return null; 
    }
}