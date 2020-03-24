//Shengnan You
//112361646
//CSE 114
//Lab#15
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Lab15 extends Application {
    private TextField inverstmentAmount = new TextField();
    private TextField numberOfYears = new TextField();
    private TextField annual = new TextField();
    private TextField future = new TextField();
    private Button calculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("Investment Amount:"), 0, 0);
        pane.add(inverstmentAmount, 1, 0);
        pane.add(new Label("Annual Interest Rate:"), 0, 2);
        pane.add(annual, 1, 2);
        pane.add(new Label("Future value:"), 0, 3);
        pane.add(future, 1, 3);
        pane.add(calculate, 1, 4);
        GridPane.setHalignment(calculate, HPos.RIGHT);
        //bt.setOnAction(this);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Lab15");
        primaryStage.setScene(scene);
        calculate.setOnAction(e -> value());
        primaryStage.show();
    }

    private void value() {
        double investmentAmount = Double.parseDouble(inverstmentAmount.getText());
        int years = Integer.parseInt(numberOfYears.getText());
        double monthly = Double.parseDouble(annual.getText()) / 1200;
        future.setText(String.format("$%.2f", (investmentAmount * Math.pow(1 + monthly, years * 12))));
    }
}
