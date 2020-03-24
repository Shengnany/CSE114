//Shengnan You
//112361646
//CSE 114
//Homework#8
import javafx.application.Application;
import java.util.*;
import java.io.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.layout.*;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.animation.Animation;


public class Homework8 extends Application{

    Button btLoadFile = new Button("Load File");
    Button btSaveFileAs = new Button("Save File As");
    Button btToLower = new Button("To Lower");
    Button btToUpper = new Button("To Upper");
    Button btToTitleCase = new Button("To Title Case");
    Button btReplaceAll = new Button("Replace All");

    TextField tfLoadFile = new TextField();
    TextField tfSaveFileAs = new TextField();
    TextField tfFind = new TextField();
    TextField tfReplaceWith = new TextField();
    TextArea taText = new TextArea();
    Label labWords = new Label("#words:");
    Label labChars = new Label("#chars:");
    long timeElapsed;
    long time;
    Label labSeconds = new Label("Seconds since last save:"+0);

    @Override
    public void start(Stage primaryStage){


        //Create and set position of GridPane
        GridPane pane=new GridPane();
        pane.setHgap(8);
        pane.setVgap(5);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20));
        //Create and position all Labels and Buttons
        pane.add(btLoadFile, 0, 0);
        pane.add(tfLoadFile, 1, 0,2,1);
        pane.add(btSaveFileAs, 2, 0);
        pane.add(tfSaveFileAs, 3, 0);
        pane.add(taText, 0, 1, 6, 6);
        pane.add(btToLower,0,10);
        pane.add(btToUpper, 1, 10);
        pane.add(btToTitleCase, 2, 10);
        pane.add(new Label("Find:"),0,11);
        pane.add(tfFind,1,11,2,1);
        pane.add(new Label("Replace with:"),3, 11);
        pane.add(tfReplaceWith,3,11);
        pane.add(btReplaceAll,5,11);
        pane.add(labWords,0,12);
        pane.add(labChars, 1, 12);
        pane.add(labSeconds,3,12,1,1);

        //Events
        btLoadFile.setOnAction(e -> {
            try {
                loadFile();
            }
            catch (FileNotFoundException ex) {
            }
        });

        btSaveFileAs.setOnAction(e -> {
            try {
                saveFile();
            }
            catch (IOException ex) {
            }
        });

        btToLower.setOnAction(event -> {
            lowerCase();
        });

        btToUpper.setOnAction(event -> {
            upperCase();
        });
        btReplaceAll.setOnAction(event -> {
            replace();
        });
        btToTitleCase.setOnAction(event -> {
            tittleCase();
        });




        EventHandler<ActionEvent> eventH = e -> {
            timeElapsed=System.currentTimeMillis()-time;
            Label labSeconds = new Label("Seconds since last save:"+timeElapsed/1000);

            ObservableList<Node> childrens = pane.getChildren();
            for(Node node : childrens) {
                if (node instanceof Label && pane.getRowIndex(node) == 12 && pane.getColumnIndex(node) == 3 ) {

                    pane.getChildren().remove(node);
                    break;
                }
            }
            pane.add(labSeconds,3,12,3,1);
        };


        btSaveFileAs.setOnAction(event -> {
            time=System.currentTimeMillis();
            Timeline animation = new Timeline(
                    new KeyFrame(Duration.millis(1000), eventH));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play(); // Start animation

        });


        taText.setOnKeyPressed(event ->{
            String s=taText.getText();
            int count1=0;
            int count2;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=' ') count1++;
            }
            String[] words=s.split(" ");
            count2=words.length;

            ObservableList<Node> childrens = pane.getChildren();
            for(Node node : childrens) {
                if (node instanceof Label && pane.getRowIndex(node) == 12 && pane.getColumnIndex(node) == 0 ) {

                    pane.getChildren().remove(node);
                    break;
                }
            }
            for(Node node : childrens) {
                if (node instanceof Label && pane.getRowIndex(node) == 12 && pane.getColumnIndex(node) == 1 ) {

                    pane.getChildren().remove(node);
                    break;
                }
            }
            Label labelWords=new Label("# Words"+" "+String.valueOf(count2));
            Label labelChars=new Label("# Chars"+" "+String.valueOf(count1));
            pane.add( labelWords,0,12);
            pane.add(labelChars, 1, 12);
        } );

        tfSaveFileAs.setOnAction(event -> {
            time=System.currentTimeMillis();
            timeElapsed=0;



        });




        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Homework8 Extra Credit Assignment");
        primaryStage.show();
    }

    public void loadFile() throws FileNotFoundException {
        File file= new File(tfLoadFile.getText());
        if (!file.exists()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("File not found!");
            alert.show();
        }
        else{

            String text = "";

            Scanner input = new Scanner(file);
            {
                while (input.hasNext()) {
                    text += input.nextLine();
                    text += "\n";` `
                }
                taText.setText(text);
            }
        }
    }

    public void saveFile() throws IOException {
        File file= new File(tfSaveFileAs.getText());

        if (tfSaveFileAs.getText().contains("$")||tfSaveFileAs.getText().contains("!")||tfSaveFileAs.getText().contains("@")||tfSaveFileAs.getText().contains("^")||tfSaveFileAs.getText().contains(")")){
            Alert alertNew = new Alert(Alert.AlertType.ERROR);
            alertNew.setContentText("File not found!");
            alertNew.show();
        }
        else{

            String text = "";

            java.io.PrintWriter output = new java.io.PrintWriter(file);
            text=taText.getText();
            output.print(text);
            output.close();


        }
    }

    public void lowerCase()  {
        String s= taText.getText();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(Character.isUpperCase(temp)) taText.setText(s.substring(0,i)+Character.toLowerCase(temp)+s.substring(i+1));
            s= taText.getText();

        }
    }

    public void tittleCase() {
        String s = taText.getText();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                s = s.substring(0, i) + Character.toUpperCase(s.charAt(i)) + s.substring(i + 1);
            taText.setText(s);
            break;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '&&i!=s.length()-1) {
                s = s.substring(0, i + 1) + Character.toUpperCase(s.charAt(i + 1)) + s.substring(i + 2);
                taText.setText(s);

            }

        }
    }
    public void upperCase () {
        String s = taText.getText();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isLowerCase(temp))
                taText.setText(s.substring(0, i) + Character.toUpperCase(temp) + s.substring(i + 1));
            s = taText.getText();

        }
    }




    public void replace()  {
        String s= taText.getText();
        s=s.replaceAll(tfReplaceWith.getText(),tfFind.getText());
        taText.setText(s);

    }




}







