import model.User;
import model.Driver;
import services.BookingService;
import services.FindMyCar;
import strategy.DriverByPrice;
import strategy.DriverFindStrategy;

public class main {
    
    public static void main(String[] args) {
        
        System.out.println("--- Starting Carpool Booking System ---");

        // 1. Instantiate the chosen Strategy
        // We can easily swap this to `new DriverByRating()` without changing the services.
        DriverFindStrategy pricingStrategy = new DriverByPrice();

        // 2. Inject the Strategy into the Services (Dependency Injection)
        FindMyCar findMyCarService = new FindMyCar(pricingStrategy);
        BookingService bookingService = new BookingService();

        // 3. Setup Dummy Request Data
        User passenger = new User();
        // In a real scenario, you would set the user's ID, name, etc. here
        
        String source = "Koramangala";
        String destination = "Indiranagar";
        int seatsRequired = 2;

        // 4. Execute the Business Flow
        System.out.println("Searching for a ride from " + source + " to " + destination + " for " + seatsRequired + " passengers...");
        
        Driver matchedDriver = findMyCarService.findMyCar(source, destination, seatsRequired);

        // 5. Handle the result
        if (matchedDriver != null) {
            System.out.println("Match found! Driver assigned.");
            
            // Proceed to create the booking
            bookingService.createBooking(passenger, matchedDriver);
            System.out.println("Booking successfully created.");
            
        } else {
            System.out.println("No available drivers or trips found for this route and seat requirement.");
        }
    }
}