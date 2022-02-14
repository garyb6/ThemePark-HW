import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themepark;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;


    @Before
    public void setUp(){
        themepark = new ThemePark();
        themepark.addDrawPoint(dodgems);
        themepark.addDrawPoint(park);
        themepark.addDrawPoint(playground);
        themepark.addDrawPoint(rollerCoaster);
        themepark.addDrawPoint(candyflossStall);
        themepark.addDrawPoint(iceCreamStall);
        themepark.addDrawPoint(tobaccoStall);

    }

    @Test
    public void canGetNumberOfAandSs(){
        assertEquals(7, themepark.getNumberofAandSs());
    }

    @Test
    public void canAddIReviewedAandS() {
        themepark.addDrawPoint(dodgems);
        assertEquals(8, themepark.getNumberofAandSs());
    }

//    @Test
//    public void canGetAllReviewed(){
//        assertEquals( , themepark.getAllReviewed());
//    }
//
//    @Test
//    public void canVisit(){
//        assertEquals(, themepark.visit());
//    }
//
//    @Test
//    public void cangetAllAllowedFor(){
//        assertEquals(, themepark.getAllAllowedFor());
//    }



}
