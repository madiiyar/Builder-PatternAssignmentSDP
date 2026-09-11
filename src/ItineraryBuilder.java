public class ItineraryBuilder implements TravelPackageBuilder{
    private final StringBuilder sb = new StringBuilder("Official Travel Itinerary\n");

    @Override
    public TravelPackageBuilder setDestination(String destination){
        sb.append("Destination: ").append(destination).append("\n");
        return this;
    }

    @Override
    public TravelPackageBuilder setFlight(String flight){
        sb.append("Flight: ").append(flight).append("\n");
        return this;
    }

    @Override
    public TravelPackageBuilder setHotel(String hotel){
        sb.append("Hotel: ").append(hotel).append("\n");
        return this;
    }

    public String getResult(){
        return sb.toString();
    }
}
