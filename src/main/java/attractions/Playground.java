package attractions;

import people.Visitor;

public class Playground extends Attraction implements behaviours.ISecurity, behaviours.IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 16){
            return false;
        } else {return true;}
    }
}
