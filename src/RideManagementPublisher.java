public interface RideManagementPublisher {
    void registerDriver(Driver driver);
    void unregisterDriver(Driver driver);
    void notifyDrivers();
}
