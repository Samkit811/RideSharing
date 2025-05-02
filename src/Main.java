public class Main {
    public static void main(String[] args) {

        Driver d1 = new Driver("John", 1);
        Driver d2 = new Driver("Alice", 2);
        Driver d3 = new Driver("Bob", 3);
        Driver d4 = new Driver("Eve", 4);
        Driver d5 = new Driver("Charlie", 5);
        Driver d6 = new Driver("Diana", 6);
        Driver d7 = new Driver("Frank", 7);
        Driver d8 = new Driver("Grace", 8);
        Driver d9 = new Driver("Heidi", 9);
        Driver d10 = new Driver("Ivan", 10);

        Passenger p1 = new Passenger("Sam", 1);
        Passenger p2 = new Passenger("Lily", 2);
        Passenger p3 = new Passenger("Mike", 3);
        Passenger p4 = new Passenger("Sophia", 4);
        Passenger p5 = new Passenger("David", 5);
        Passenger p6 = new Passenger("Emma", 6);
        Passenger p7 = new Passenger("James", 7);
        Passenger p8 = new Passenger("Olivia", 8);
        Passenger p9 = new Passenger("Ethan", 9);
        Passenger p10 = new Passenger("Ava", 10);

        Location loc1 = new Location(12.9716, 77.5946);   // Bangalore
        Location loc2 = new Location(28.7041, 77.1025);   // Delhi
        Location loc3 = new Location(19.0760, 72.8777);   // Mumbai
        Location loc4 = new Location(13.0827, 80.2707);   // Chennai
        Location loc5 = new Location(22.5726, 88.3639);   // Kolkata
        Location loc6 = new Location(23.0225, 72.5714);   // Ahmedabad
        Location loc7 = new Location(26.9124, 75.7873);   // Jaipur
        Location loc8 = new Location(17.3850, 78.4867);   // Hyderabad
        Location loc9 = new Location(21.1702, 72.8311);   // Surat
        Location loc10 = new Location(18.5204, 73.8567);  // Pune

        Ride r1 = new Ride(p1, loc1, loc2, 1);
        Ride r2 = new Ride(p2, loc2, loc3, 2);
        Ride r3 = new Ride(p3, loc3, loc4, 3);
        Ride r4 = new Ride(p4, loc4, loc5, 4);
        Ride r5 = new Ride(p5, loc5, loc6, 5);

        Ride r6 = new Ride(p6, loc6, loc7, 6);
        Ride r7 = new Ride(p7, loc7, loc8, 7);
        Ride r8 = new Ride(p8, loc8, loc9, 8);
        Ride r9 = new Ride(p9, loc9, loc10, 9);
        Ride r10 = new Ride(p10, loc10, loc1, 10);

        Ride r11 = new Ride(p1, loc2, loc5, 11);
        Ride r12 = new Ride(p2, loc3, loc6, 12);
        Ride r13 = new Ride(p3, loc4, loc7, 13);
        Ride r14 = new Ride(p4, loc5, loc8, 14);
        Ride r15 = new Ride(p5, loc6, loc9, 15);

        RideManagement rideManagement = new RideManagement();
        rideManagement.registerPassenger(p1);
        rideManagement.registerPassenger(p2);
        rideManagement.registerPassenger(p3);

        rideManagement.registerDriver(d1);
        rideManagement.registerDriver(d2);

        rideManagement.addRide(r1);
        rideManagement.addRide(r2);
        rideManagement.addRide(r3);
    }
}