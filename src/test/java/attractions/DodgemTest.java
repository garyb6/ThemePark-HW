package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitoryoung;
    Visitor visitorold;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitoryoung = new Visitor(10, 144.0, 50.00);
        visitorold = new Visitor (25, 201.00, 500.00);

    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.00);
    }

    @Test
    public void canChargeFullPriceToOver12s(){
        assertEquals(4.50, dodgems.priceFor(visitorold), 0.00);
    }

    @Test
    public void CanChargeHalfPriceToUnder12s(){
        assertEquals(2.25, dodgems.priceFor(visitoryoung), 0.00);
    }
}
