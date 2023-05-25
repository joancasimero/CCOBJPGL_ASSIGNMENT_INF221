package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import model.*;

public class ThemController {

    @FXML
    ImageView lisa, mikey, olivia, sabrina, viper;

    @FXML
    Button mikeybutton, lisabutton, oliviabutton, sabrinabutton, viperbutton;

    mikey mikey1 = new mikey();
    lisa lisa1 = new lisa();
    olivia olivia1 = new olivia();
    sabrina sabrina1 = new sabrina();
    viper viper1 = new viper();

    public void initialize() {

        mikey1.setFeature("Black hair");
        mikey1.setPersonality("Very Sweet");

        lisa1.setFeature("Doe eyes");
        lisa1.setPersonality("Kind");

        olivia1.setFeature("Brown hair");
        olivia1.setPersonality("Friendly");

        sabrina1.setFeature("Blond hair");
        sabrina1.setPersonality("Optimistic");

        viper1.setFeature("Black short hair");
        viper1.setPersonality("Smart");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(lisabutton)) {
            alert.setContentText("Lisa has " + lisa1.getFeature() + " and is " + lisa1.getPersonality());
        }

        if (sourceButton == mikeybutton) {
            alert.setContentText("Mikey has " + mikey1.getFeature() + " and is " + mikey1.getPersonality());
        }

        if (sourceButton == oliviabutton) {
            alert.setContentText("Olivia has " + olivia1.getFeature() + " and is " + olivia1.getPersonality());
        }

        if (sourceButton == sabrinabutton) {
            alert.setContentText("Sabrina has " + sabrina1.getFeature() + " and is " + sabrina1.getPersonality());
        }

        if (sourceButton == viperbutton) {
            alert.setContentText("Viper has " + viper1.getFeature() + " and is " + viper1.getPersonality());
        }

        alert.showAndWait();

    }
}