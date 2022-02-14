import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import java.util.ArrayList;

public class ThemePark {

    private ArrayList<behaviours.IReviewed> attractionsAndStalls;

    public ThemePark() {
        this.attractionsAndStalls = new ArrayList<IReviewed>(){

        }
    }

    public static ArrayList<IReviewed> getAttractionsAndStalls() {
        return attractionsAndStalls;
    }

    public ArrayList getAllReviewed() {

    }

    public void visit(Visitor visitor, Attraction attraction) {
    }

    public ArrayList getAllAllowedFor() {
    }
}
