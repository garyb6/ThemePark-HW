package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitoryoungandshort;
    Visitor visitoroldandshort;
    Visitor visitorjustright;
    Visitor visitoryoungbuttall;



    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitoryoungandshort = new Visitor (10, 144.0, 50.00);
        visitoroldandshort = new Visitor (25, 142.00, 500.00);
        visitorjustright = new Visitor (13, 147, 5.00);
        visitoryoungbuttall = new Visitor(9, 150, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canCheckIfVisitorCanRideRollerCoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitorjustright));
    }

    @Test
    public void canCheckIfVisitorIsOldButTooShort(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitoroldandshort));
    }

    @Test
    public void canCheckIfVisitorIsYoungButTall(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitoryoungbuttall));
    }

    @Test
    public void canCheckIfVisitorIsYoungAndShort(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitoryoungandshort));
    }
}
