public class Passenger {
    private String name;
    private Integer id;
    private Integer money;
    private Location location;

    public Passenger(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMoney() {
        return money;
    }

    public void addMoney(Integer money){
         this.money += money;
    }

    public void subtractMoney(Integer money){
        this.money -= money;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
