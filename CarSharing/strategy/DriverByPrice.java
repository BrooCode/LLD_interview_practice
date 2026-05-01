package strategy;

import java.util.List;

import model.Driver;

public class DriverByPrice implements DriverFindStrategy {
    
    @Override
    public List<Driver> findMyCar(String source,String destination,int noOfSeats){
        
        // return drivers based on fare
        return null;
    }

}
