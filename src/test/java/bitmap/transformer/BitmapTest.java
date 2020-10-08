package bitmap.transformer;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class BitmapTest {
    @Test
    public void testFileGrayMarioExists() {
        Bitmap bit = new Bitmap();
        bit.grayUp(bit.ogFilePath);
        File file = new File("src/main/resources/mario.bmp");
        assertTrue(file.exists());
    }

    @Test
    public void testFileGlowMarioExists() {
        Bitmap bit = new Bitmap();
        bit.glowUp(bit.ogFilePath);
        File file = new File("src/main/resources/mario2.bmp");
        assertTrue(file.exists());
    }

    @Test
    public void testFileGreenMarioExists() {
        Bitmap bit = new Bitmap();
        bit.greenUp(bit.ogFilePath);
        File file = new File("src/main/resources/mario3.bmp");
        assertTrue(file.exists());
    }
}
