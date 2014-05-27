package sample;

/**
 * Created by Yaroslav on 5/22/2014.
 */
 private BufferedImage img = null;

    public void GetImage() {

        try {
            img = ImageIO.read(new File("bar1.jpg"));
        } catch (IOException e) {
        }
    }

    public void Paint(Graphics g) {
        g.drawImage(img, 50, 50, null);
    }


}
