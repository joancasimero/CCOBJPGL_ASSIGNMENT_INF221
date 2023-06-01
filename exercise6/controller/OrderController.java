package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class OrderController implements Initializable{

    @FXML
    Label name1, name2, name3, name4, price1, price2, price3, price4, total, qty1, qty2, qty3, qty4, lineAmount1, lineAmount2, lineAmount3, lineAmount4;


    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    // @FXML
    // // private Parent root = null;

    FXMLLoader loader;


    public void initialize(URL location, ResourceBundle resources){

        if (HomeController.blamp.getProductStatus()) {
            name1.setText(HomeController.blamp.getProductName());
            price1.setText(Double.toString(HomeController.blamp.getProductPrice()));
            qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
            
            name1.setVisible(true);
            price1.setVisible(true);
        }

        if (HomeController.clamp.getProductStatus()) {
 
            name2.setText(HomeController.clamp.getProductName());
            price2.setText(Double.toString(HomeController.clamp.getProductPrice()));
            qty2.setText(Double.toString(HomeController.blamp.getProductQuantity()));
           
            name2.setVisible(true);
            price2.setVisible(true);
        }

        if (HomeController.wlamp.getProductStatus()) {
 
            name3.setText(HomeController.wlamp.getProductName());
            price3.setText(Double.toString(HomeController.wlamp.getProductPrice()));
            qty3.setText(Double.toString(HomeController.blamp.getProductQuantity()));
           
            name3.setVisible(true);
            price3.setVisible(true);
        }

        if (HomeController.blampink.getProductStatus()) {
 
            name3.setText(HomeController.blampink.getProductName());
            price3.setText(Double.toString(HomeController.blampink.getProductPrice()));
            qty3.setText(Double.toString(HomeController.blamp.getProductQuantity()));
           
            name3.setVisible(true);
            price3.setVisible(true);
        }

        double amt1 = HomeController.blamp.getProductPrice()* HomeController.blamp.getProductQuantity();
        double amt2 = HomeController.clamp.getProductPrice()* HomeController.clamp.getProductQuantity();
        double amt3 = HomeController.wlamp.getProductPrice()* HomeController.wlamp.getProductQuantity();
        double amt4 = HomeController.blampink.getProductPrice()* HomeController.blampink.getProductQuantity();

        double finalamt = amt1 + amt2 + amt3 + amt4;

        total.setText(Double.toString(finalamt));

    }
}

