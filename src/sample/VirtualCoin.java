package sample;

/**
 * Created by Yaroslav on 5/22/2014.
 */


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

import static javax.imageio.ImageIO.*;

public class VirtualCoin extends RealCoin {

    private Image Img = new Image(new File("ber1.jpg").toURI().toString());




    public Image GetImage() {

        return Img;
    }



}
