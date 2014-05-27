package sample;

/**
 * Created by Yaroslav on 5/22/2014.
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

import static javax.imageio.ImageIO.*;

public class VirtualCoin extends RealCoin {

    public void GetImage() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("E:\\Моё всё\\Фотки\\Разное\\IMAG0275.jpg"));
        } catch (IOException e) {
        }
    }

    public void paint(Graphics g) {
        g.drawImage(new File("E:\\Моё всё\\Фотки\\Разное\\IMAG0275.jpg"), 50, 50, null);
    }

}
