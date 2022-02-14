import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
import java.util.ArrayList;

public class ThemePark {

    private ArrayList<behaviours.IReviewed> attractionsAndStalls;

    public ThemePark() {
        this.attractionsAndStalls = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAttractionsAndStalls() {
        return attractionsAndStalls;
    }

    public int getNumberofAandSs() {
        return this.attractionsAndStalls.size();
    }

    public void addDrawPoint(IReviewed drawPoint) {
        this.attractionsAndStalls.add(drawPoint);
    }

//    public ArrayList getAllReviewed() {
//    }

//
//    public void visit(Visitor visitor, Attraction attraction) {
//    }
//
//    public ArrayList getAllAllowedFor() {
//    }
}
