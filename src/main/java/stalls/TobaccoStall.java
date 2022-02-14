package stalls;

import people.Visitor;

public class TobaccoStall extends Stall implements behaviours.ISecurity, behaviours.IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18){
            return true;
        } else {return false;}
    }

    @Override
    public int getRating() {
        return 0;
    }
}
