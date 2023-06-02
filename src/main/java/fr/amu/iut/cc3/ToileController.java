package fr.amu.iut.cc3;



import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;


    @FXML
    private Button submit;
    @FXML
    private Button cancel;
    @FXML
    private Circle point1;
    @FXML
    private Circle point2;
    @FXML
    private Circle point3;
    @FXML
    private Circle point4;
    @FXML
    private Circle point5;
    @FXML
    private Circle point6;
    int C1x;
    int C1y;
    int C2y;
    int C2x;
    int C3x;
    int C3y;
    int C4x;
    int C4y;
    int C5x;
    int C5y;
    int C6x;
    int C6y;
    @FXML
    private TextField TextFieldC1;
    @FXML
    private TextField TextFieldC2;
    @FXML
    private TextField TextFieldC3;
    @FXML
    private TextField TextFieldC4;
    @FXML
    private TextField TextFieldC5;
    @FXML
    private TextField TextFieldC6;
    @FXML
    private Label limites;

    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    @FXML
    protected void onButtonActivated() {
        C1x = getXRadarChart(Double.parseDouble(TextFieldC1.getText()), 1);
        C1y = getYRadarChart(Double.parseDouble(TextFieldC1.getText()), 1);
        point1.setCenterX(C1x);
        point1.setCenterY(C1y);

        C2x = getXRadarChart(Double.parseDouble(TextFieldC2.getText()), 2);
        C2y = getYRadarChart(Double.parseDouble(TextFieldC2.getText()), 2);
        point2.setCenterX(C2x);
        point2.setCenterY(C2y);

        C3x = getXRadarChart(Double.parseDouble(TextFieldC3.getText()), 3);
        C3y = getYRadarChart(Double.parseDouble(TextFieldC3.getText()), 3);
        point3.setCenterX(C3x);
        point3.setCenterY(C3y);

        C4x = getXRadarChart(Double.parseDouble(TextFieldC4.getText()), 4);
        C4y = getYRadarChart(Double.parseDouble(TextFieldC4.getText()), 4);
        point4.setCenterX(C4x);
        point4.setCenterY(C4y);

        C5x = getXRadarChart(Double.parseDouble(TextFieldC5.getText()), 5);
        C5y = getYRadarChart(Double.parseDouble(TextFieldC5.getText()), 5);
        point5.setCenterX(C5x);
        point5.setCenterY(C5y);

        C6x = getXRadarChart(Double.parseDouble(TextFieldC6.getText()), 6);
        C6y = getYRadarChart(Double.parseDouble(TextFieldC6.getText()), 6);
        point6.setCenterX(C6x);
        point6.setCenterY(C6y);
    }

@FXML
    protected void CancelButton(){
        TextFieldC1.setText("");
        TextFieldC2.setText("");
        TextFieldC3.setText("");
        TextFieldC4.setText("");
        TextFieldC5.setText("");
        TextFieldC6.setText("");
        point1.setCenterX(0);
        point1.setCenterY(0);
        point2.setCenterX(0);
        point2.setCenterY(0);
        point3.setCenterX(0);
        point3.setCenterY(0);
        point4.setCenterX(0);
        point4.setCenterY(0);
        point5.setCenterX(0);
        point5.setCenterY(0);
        point6.setCenterX(0);
        point6.setCenterY(0);

}


}
