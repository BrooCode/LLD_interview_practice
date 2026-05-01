package strategy;
import java.util.List;
import model.Driver;

public interface DriverFindStrategy {
    
    List<Driver> findMyCar(String source,String destination,int noOfSeats);

}
