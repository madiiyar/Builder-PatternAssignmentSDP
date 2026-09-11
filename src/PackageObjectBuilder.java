public class PackageObjectBuilder implements TravelPackageBuilder {
    private String destination;
    private String flight;
    private String hotel;

    @Override
    public TravelPackageBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public TravelPackageBuilder setFlight(String flight) {
        this.flight =flight;
        return this;
    }

    @Override
    public TravelPackageBuilder setHotel(String hotel) {
        this.hotel =hotel;
        return this;
    }

    public TravelPackage getResult(){
        if(destination == null || destination.isEmpty()){
            throw new IllegalStateException("Validation Error: Destination is required to build a travel package!");
        }
        return new TravelPackage(destination,flight,hotel);
    }
}
