public class Ride {
    private Location sourceLocation;
    private Location destinationLocation;
    private RideType rideType;
    private Integer price;
    private Passenger passenger;
    private Driver driver;
    private Integer id;

    public Ride(Passenger passenger, Location sourceLocation, Location destinationLocation, Integer id){
        this.passenger = passenger;
        this.rideType = RideType.REQUESTED;
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
        this.id = id;
        this.calculateRideFair();
    }

    public Integer getId() {
        return id;
    }

    public void updateSourceLocation(Location location){
        this.sourceLocation = location;
        this.calculateRideFair();
    }

    public void updateDestinationLocation(Location location){
        this.destinationLocation = location;
        this.calculateRideFair();
    }

    private void calculateRideFair(){
        if(this.sourceLocation != null && this.destinationLocation != null){
           Double longitudeDifference = Math.abs(this.sourceLocation.getLongitude() - this.destinationLocation.getLongitude());
           Double latitudeDifference = Math.abs(this.sourceLocation.getLatitude() - this.destinationLocation.getLatitude());
           if(latitudeDifference + longitudeDifference  >= 5.0){
               this.price = 100;
           } else {
               this.price = 50;
           }
        }
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
        this.setRideType(RideType.ACCEPTED);
    }

    public RideType getRideType() {
        return rideType;
    }

    private void setRideType(RideType rideType) {
         this.rideType = rideType;
    }

    public void startRide(){
        System.out.println("Ride is started");
        this.setRideType(RideType.IN_PROGRESS);
        this.completedRide();
    }

    public void completedRide(){
        this.setRideType(RideType.COMPLETED);
    }

    public void cancelRide(){
        this.setRideType(RideType.CANCELLED);
    }

    public Integer getPrice() {
        return price;
    }
}
