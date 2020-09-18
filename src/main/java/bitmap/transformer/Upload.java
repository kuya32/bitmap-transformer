package bitmap.transformer;

import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Upload {
    String filePath = "src/main/resources/mario.bmp";
    BufferedImage image = null;
    File f = null;


    // Used the youTube video to read and write new bmp file: https://www.youtube.com/watch?v=lGX0Gc6d51s
    // Used the youtube video to change the color of bmp file: https://www.youtube.com/watch?v=cq80Itgs5Lw
    public void loadup(String filePath) {
        try {
            f = new File(filePath);
            image = ImageIO.read(f);
            for (int i = 0; i < image.getWidth(); i++) {
                for (int j = 0; j < image.getWidth(); j++) {
                    Color c = new Color(image.getRGB(j,i));
                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();
                    int a = c.getAlpha();

//                    int gr = (r + g + b)/10;
                    Color gColor = new Color(r, g, b, a);
                    image.setRGB(j, i, gColor.getRGB());
                }
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Could not find file path");
        }

        f = new File(filePath);
        try {
            ImageIO.write(image, "bmp", f);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Could not find file path");
        }
    }

}
