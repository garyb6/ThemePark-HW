package attractions;

public class Park extends Attraction implements behaviours.IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }
}
