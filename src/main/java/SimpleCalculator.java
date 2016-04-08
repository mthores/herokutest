import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by Mikkel on 24/02/2016.
 */
public class SimpleCalculator extends Application {

    public static void main(String [] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        Button plus = new Button("+");
        Button minus = new Button("-");
        Label result = new Label();
        result.setStyle("-fx-underline: true");

        plus.setOnAction(e -> {

            try {
                int var1 = Integer.parseInt(tf1.getText());
                int var2 = Integer.parseInt(tf2.getText());
                result.setText(""+ calculate(var1, var2, plus.getText()));
            } catch (Exception ex1) {
                result.setText("Invalid Input");
                System.out.println("Invalid Input");
            }
        });

        minus.setOnAction(e -> {

            try {
                int var1 = Integer.parseInt(tf1.getText());
                int var2 = Integer.parseInt(tf2.getText());
                result.setText(""+ calculate(var1, var2, minus.getText()));
            } catch (Exception ex1) {
                result.setText("Invalid Input");
                System.out.println("Invalid Input ");
            }
        });
        BorderPane borderPane1 = new BorderPane();

        HBox hBox1 = new HBox();
        hBox1.setStyle("-fx-background-color: dimgray");
        hBox1.getChildren().addAll(tf1, tf2, plus, minus);
        hBox1.setSpacing(10);
        hBox1.setPadding(new Insets(10, 20, 10, 20));

        HBox hBox2 = new HBox();
        hBox2.setStyle("-fx-background-color: rgba(93, 57, 104, 0.15)");
        hBox2.getChildren().addAll(result);
        hBox2.setSpacing(10);
        hBox2.setPadding(new Insets(10, 20, 10, 20));
        Label lb = new Label ("Texas Instrument Ultra Edition ");;
        lb.setStyle("-fx-underline: true");

        HBox hBox3 = new HBox();
        hBox3.setStyle("-fx-background-color: rgba(93, 57, 104, 0.15)");
        hBox3.getChildren().addAll(lb);
        hBox3.setSpacing(10);
        hBox3.setPadding(new Insets(10, 20, 10, 20));




        borderPane1.setCenter(hBox1);
        borderPane1.setBottom(hBox2);
        borderPane1.setTop(hBox3);
        
        
        Scene scene = new Scene(borderPane1, 400, 120);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Texas Instrument Ultimate Edition");

        primaryStage.show();






    }

    public int calculate(int var1, int var2, String oper){
        int result = 0;

        if (oper.equals("+")) {
            result = var1 + var2;
        }

        if (oper.equals("-")) {
            result = var1 - var2;
        }

        return result;
    }
}
