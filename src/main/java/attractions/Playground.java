package attractions;

import people.Visitor;

public class Playground extends Attraction implements behaviours.ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return false;
    }
}
