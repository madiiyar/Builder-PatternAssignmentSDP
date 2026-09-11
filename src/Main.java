public class Main {
    public static void main(String[] args) {
        TravelDirector director = new TravelDirector();

        PackageObjectBuilder objBuilder = new PackageObjectBuilder();
        director.makeLuxuryHoliday(objBuilder);
        TravelPackage luxuryPackage = objBuilder.getResult();

        System.out.println("Java Object Output");
        System.out.println(luxuryPackage.toString());

        System.out.println("\n------------\n");

        ItineraryBuilder textBuilder = new ItineraryBuilder();
        director.makeLuxuryHoliday(textBuilder);
        String itinerary = textBuilder.getResult();

        System.out.println("Text String Output");
        System.out.println(itinerary);
    }
}
