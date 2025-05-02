public class Driver implements DriverObserver {
    private String name;
    private Integer id;
    private DriverType driverType;
    private Location location;
    private Integer money;

    public Driver(String name, Integer id){
        this.name = name;
        this.id = id;
        this.driverType = DriverType.AVAILABLE;
        this.money = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setDriverType(DriverType driverType) {
        this.driverType = driverType;
    }

    public void addMoney(Integer money){
        this.money += money;
    }

    @Override
    public Boolean notifyRide(Ride ride) {
        if(ride.getPrice() > 50.0 && ride.getRideType() == RideType.REQUESTED){
            return true;
        }
        return false;
    }

    @Override
    public DriverType getDriverType() {
        return driverType;
    }
}
