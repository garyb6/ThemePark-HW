package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitoryoung;
    Visitor visitorold;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitoryoung = new Visitor (10, 144.0, 50.00);
        visitorold = new Visitor (25, 201.00, 500.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canCheckIfVisitorIsAllowedToPlay(){
        assertEquals(true, playground.isAllowedTo(visitoryoung));
    }

    @Test
    public void canCheckIfVisitorIsTooOldToPlay(){
        assertEquals(false, playground.isAllowedTo(visitorold));
    }
}
