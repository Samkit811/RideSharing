import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RideManagement implements RideManagementPublisher{
    private HashMap<Integer, Driver> driverHashMap;
    private Queue<Ride> requestRideQueue;
    private HashMap<Integer, Passenger> passengerHashMap;
    private HashMap<Integer, Ride> rideHashMap;

    public RideManagement(){
        this.driverHashMap = new HashMap<>();
        this.requestRideQueue = new LinkedList<>();
        this.passengerHashMap = new HashMap<>();
        this.rideHashMap = new HashMap<>();
    }

    @Override
    public void registerDriver(Driver driver) {
        System.out.println("Registering the Driver: " + driver.getName());
        this.driverHashMap.put(driver.getId(), driver);
    }

    @Override
    public void unregisterDriver(Driver driver) {
        System.out.println("Removing the Driver: " + driver.getName());
        this.driverHashMap.remove(driver.getId());
    }

    @Override
    public void notifyDrivers(Ride ride) {
        Boolean isDriverAssign = false;
        for(Driver driver: this.driverHashMap.values()){
            if(driver.getDriverType() == DriverType.AVAILABLE){
                if(driver.notifyRide(ride)){
                    System.out.println("Driver: " + driver.getName() + " has accepted ride");
                    ride.setDriver(driver);
                    this.startRide(ride);
                    isDriverAssign = true;
                    break;
                }
            }
        }
        if(isDriverAssign == false){
            this.cancelRide(ride);
        }
    }

    @Override
    public void registerPassenger(Passenger passenger) {
        System.out.println("Registering the Passenger: " + passenger.getName());
        this.passengerHashMap.put(passenger.getId(), passenger);
    }

    @Override
    public void unregisterPassenger(Passenger passenger) {
        System.out.println("Registering the Passenger: " + passenger.getName());
        this.passengerHashMap.remove(passenger.getId());
    }

    @Override
    public void addRide(Ride ride) {
        if(this.rideHashMap.containsKey(ride.getId())){
            this.removeRide(ride);
        }
        this.rideHashMap.put(ride.getId(), ride);
        this.requestRideQueue.add(ride);
        this.notifyDrivers(ride);
    }

    @Override
    public void removeRide(Ride ride) {
        if(ride.getRideType() == RideType.CANCELLED){
            System.out.println("Ride is Cancelled");
        }
        this.requestRideQueue.remove(ride);
        this.rideHashMap.remove(ride.getId());
    }

    public void startRide(Ride ride){
        ride.startRide();
    }

    public void cancelRide(Ride ride){
        ride.cancelRide();
        this.removeRide(ride);
    }
}
