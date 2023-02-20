import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printerTest;

    @Before
    public void before(){
        printerTest = new Printer();
    }

    @Test
    public void hasSheetsLeft(){
        assertEquals(100, printerTest.getSheetsLeft());
    }

    @Test
    public void notEnoughPaperToPrint(){
        printerTest.print(20, 10);
        assertEquals(100, printerTest.getSheetsLeft());
        assertEquals(500, printerTest.getTonerVolume());
    }

    @Test
    public void hasEnoughPaperToPrint(){
        printerTest.print(5, 5);
        assertEquals(75, printerTest.getSheetsLeft());
        assertEquals(475, printerTest.getTonerVolume());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(500, printerTest.getTonerVolume());
    }

}
