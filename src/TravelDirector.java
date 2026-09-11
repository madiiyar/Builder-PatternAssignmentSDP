public class TravelDirector {
    public void makeLuxuryHoliday(TravelPackageBuilder builder) {
        builder.setDestination("Maldives")
                .setFlight("First Class")
                .setHotel("5-Star Overwater Bungalow");
    }

    public void makeBackpackerTrip(TravelPackageBuilder builder) {
        builder.setDestination("Thailand")
                .setFlight("Economy")
                .setHotel("Hostel Dormitory");
    }
}
