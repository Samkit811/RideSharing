public interface DriverObserver {
    Boolean notifyRide(Ride ride);
    DriverType getDriverType();
}
