package hauptPaket;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MyCanvasTest {

    private MyCanvas myCanvas;

    @Test
    public void setBoundsGTest() {
        myCanvas = new MyCanvas(10, 10);
        myCanvas.setBoundsG(5, 10, 20, 25);
        final Rectangle bounds = myCanvas.getBounds();
        assertNotNull(bounds);
        assertEquals(5, bounds.getX(), 0.01);
        assertEquals(10, bounds.getY(), 0.01);
        assertEquals(20, bounds.getWidth(), 0.01);
        assertEquals(25, bounds.getHeight(), 0.01);
    }

    @Test
    public void setBrightTest() {
        myCanvas = new MyCanvas(50, 50);
        myCanvas.setBright(10, 15, 5);
        assertEquals(-16448251, myCanvas.img.getRGB(10, 15), 0.01);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void setBrightOutTest() {
        myCanvas = new MyCanvas(50, 50);
        myCanvas.setBright(10, 55, 5);
    }
}