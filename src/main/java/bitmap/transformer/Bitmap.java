package bitmap.transformer;

import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Bitmap {
    public String ogFilePath = "src/main/resources/ogMario.bmp";
    public String filePath1 = "src/main/resources/mario.bmp";
    public String filepath2 = "src/main/resources/mario2.bmp";
    public String filePath3 = "src/main/resources/mario3.bmp";
    BufferedImage image = null;
    File f = null;


    // Used the youTube video to read and write new bmp file: https://www.youtube.com/watch?v=lGX0Gc6d51s
    // Used the youtube video to change the color of bmp file: https://www.youtube.com/watch?v=cq80Itgs5Lw
    public File grayUp(String filePath) {
        String filePathGray = filePath1;
        try {
            f = new File(filePath);
            System.out.println("Found the file path!");
            image = ImageIO.read(f);
            for (int i = 0; i < image.getWidth(); i++) {
                for (int j = 0; j < image.getWidth(); j++) {
                    Color c = new Color(image.getRGB(j,i));
                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();
                    int a = c.getAlpha();

                    int gr = (r + g + b)/10;
                    Color gColor = new Color(gr, gr, gr, a);
                    image.setRGB(j, i, gColor.getRGB());
                }
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Could not find file path");
        }

        f = new File(filePathGray);
        System.out.println("Creating new grayed bitmap file!");
        try {
            ImageIO.write(image, "bmp", f);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Could not create new file");
        }
        return f;
    }

    public File glowUp(String filePath) {
        String filePathInvert = filepath2;
        try {
            f = new File(filePath);
            System.out.println("Found the file path!");
            image = ImageIO.read(f);
            for (int i = 0; i < image.getWidth(); i++) {
                for (int j = 0; j < image.getWidth(); j++) {
                    Color c = new Color(image.getRGB(j,i));
                    int r = 255 - c.getRed();
                    int g = 255 - c.getGreen();
                    int b = 255 - c.getBlue();
                    int a = c.getAlpha();

                    Color gColor = new Color(r, g, b, a);
                    image.setRGB(j, i, gColor.getRGB());
                }
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Could not find file path");
        }

        f = new File(filePathInvert);
        System.out.println("Creating new glowing bitmap file!");
        try {
            ImageIO.write(image, "bmp", f);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Could not create new file");
        }
        return f;
    }

    public File greenUp(String filePath) {
        String filePathGreen = filePath3;
        try {
            f = new File(filePath);
            System.out.println("Found the file path!");
            image = ImageIO.read(f);
            for (int i = 0; i < image.getWidth(); i++) {
                for (int j = 0; j < image.getWidth(); j++) {
                    Color c = new Color(image.getRGB(j,i));
                    int r = 0;
                    int g = c.getGreen();
                    int b = 0;
                    int a = c.getAlpha();

                    Color gColor = new Color(r, g, b, a);
                    image.setRGB(j, i, gColor.getRGB());
                }
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Could not find file path");
        }

        f = new File(filePathGreen);
        System.out.println("Creating new greened bitmap file!");
        try {
            ImageIO.write(image, "bmp", f);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Could not create new file");
        }
        return f;
    }

}
