import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themepark;

    @Before
    public void setUp(){
        themepark = new ThemePark();
    }

    @Test
    public void canGetList(){
        assertEquals(, themepark.getAttractionsAndStalls());
    }

    @Test
    public void canGetAllReviewed(){
        assertEquals(, themepark.getAllReviewed());
    }

    @Test
    public void canVisit(){
        assertEquals(, themepark.visit());
    }

    @Test
    public void cangetAllAllowedFor(){
        assertEquals(, themepark.getAllAllowedFor());
    }



}
