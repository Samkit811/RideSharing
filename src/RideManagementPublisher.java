public interface RideManagementPublisher {
    void registerDriver(Driver driver);
    void unregisterDriver(Driver driver);
    void notifyDrivers();
    void registerPassenger(Passenger passenger);
    void unregisterPassenger(Passenger passenger);
    void addRide(Ride ride);
    void removeRide(Ride ride);
}
