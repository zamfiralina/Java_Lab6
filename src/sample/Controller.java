package sample;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.shape.VertexFormat;

import java.awt.*;
import java.util.Random;

public class Controller {

    public Button drawButton;
    public Canvas canvas;
    public TextField inputField;
    public GridPane gridPane;

    public void drawButtonAction(ActionEvent actionEvent) {
        //System.out.println("PAINT!! \n\t To be continued....");
        Random random = new Random();

        switch (inputField.getText()) {

            case "4":
                //Rectangle rectangle = new Rectangle();
                //rectangle.setBounds(random.nextInt(),random.nextInt(),random.nextInt(),random.nextInt());

                //gridPane.getChildren().add(rectangle);

                break;


            default:
                Circle circle = new Circle();
                circle.setCenterX(random.nextInt());
                circle.setCenterY(random.nextInt());
                circle.setRadius(random.nextInt(50));
                circle.setFill(Color.RED);
                circle.setStrokeWidth(4f);

                gridPane.getChildren().add(circle);
                break;

        }


    }

    public void canvasDrawShape(MouseEvent mouseEvent) {
        Random random = new Random();

        System.out.println(inputField.getText());

        Circle c = new Circle();
        c.setCenterX(random.nextInt());
        c.setCenterY(random.nextInt());
        c.setRadius(random.nextInt(50));
        c.setFill(Color.RED);
        c.setStrokeWidth(4f);

        gridPane.getChildren().add(c);


    }
}
