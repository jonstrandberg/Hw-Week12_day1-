import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle testBottle;

    @Before
    public void before () {
        testBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, testBottle.getVolume());
    }

    @Test
    public void takeDrink(){
        testBottle.drink();
        assertEquals(90, testBottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        testBottle.empty();
        assertEquals(0, testBottle.getVolume());
    }

    @Test
    public void fillBottle(){
        testBottle.fill();
        assertEquals(100, testBottle.getVolume());
    }

}
