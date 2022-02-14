package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction implements behaviours.IReviewed, behaviours.ISecurity, behaviours.ITicketed{

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145.00){
            return true;
        } else return false;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200.00) {
            return defaultPrice() * 2;
        } else return defaultPrice();
    }

    public String getName(){
        return name;
    }

    public int getRating(){
        return 0;
    }
}
