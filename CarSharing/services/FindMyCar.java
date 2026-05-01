package services;

import model.Driver;

import strategy.DriverFindStrategy;

public class FindMyCar {

    private static final int MAX_CARPOOL_SEATS = 3;
    
    private DriverFindStrategy driverFindStrategy;

    public FindMyCar(DriverFindStrategy driverFindStrategy) {
        this.driverFindStrategy = driverFindStrategy;
    }

    public Driver findMyCar(String source, String destination,int noOfSeats)
    {
        if (noOfSeats > MAX_CARPOOL_SEATS) {
            // Fast-Fail: Reject the request immediately without hitting the DB/Strategy
            throw new IllegalArgumentException("Exceeds capacity. You can request a maximum of " + MAX_CARPOOL_SEATS + " seats per booking.");
        }
        driverFindStrategy.findMyCar(source,destination,noOfSeats);
        return null;
    }
    

}
