package stalls;

public class IceCreamStall extends Stall implements behaviours.IReviewed {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public int getRating() {
        return 0;
    }
}
