package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import java.awt.*;

import java.io.File;
import java.io.IOException;

public class Controller {




    @FXML
    private Button ShowImageButton;

    @FXML
    private ImageView image;



    @FXML
    void ShowImage(ActionEvent event) {

        image.setVisible(true);
        ShowImageButton.setVisible(false);
        HideImageButton.setVisible(true);

    }
    @FXML
    private Button HideImageButton;

    @FXML
    void HideImage(ActionEvent event) {
        image.setVisible(false);
        ShowImageButton.setVisible(true);
        HideImageButton.setVisible(false);
    }

    @FXML
    private Button ChooseImageButton;
    private Desktop desktop = Desktop.getDesktop();

    @FXML
    void ChooseImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showOpenDialog(null);
        try {
            Image img = new Image(file.toURI().toString());
            image.setImage(img);
        } catch (Exception e){
            System.out.print("Choose the file!");
        }

        }

}
