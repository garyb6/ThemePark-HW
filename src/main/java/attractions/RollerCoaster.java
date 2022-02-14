package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction implements behaviours.ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145.00){
            return true;
        } else return false;
    }
}
