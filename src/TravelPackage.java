public class TravelPackage {
    private final String destination;
    private final String flight;
    private final String hotel;

    TravelPackage(String destination,String flight, String hotel){
        this.destination = destination;
        this.flight = flight;
        this.hotel = hotel;
    }

    @Override
    public String toString(){
        return "TravelPackage[Destination=" + destination + ", Flight=" + flight + ", Hotel=" + hotel + "]";
    }
}
