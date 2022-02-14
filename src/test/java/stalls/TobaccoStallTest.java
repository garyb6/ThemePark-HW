package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorold;
    Visitor visitoryoung;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitoryoung = new Visitor(17, 144.0, 50.00);
        visitorold = new Visitor (18, 201.00, 500.00);

    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canCheckIfVisitorIsNotOldEnoughToBuy(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitoryoung));
    }

    @Test
    public void canCheckIfVisitorIsOldEnoughToBuy(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitorold));
    }

}
