/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 2492595
 */
public class Lab02 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        StackPane middle = new StackPane();
        Label lblTop = new Label("Random Game");
        Label lblBottom = new Label("Waiting...");
        Label lblImage = new Label();
        
        middle.getChildren().add(lblImage);
        
        root.setTop(lblTop);
        root.setBottom(lblBottom);
        root.setCenter(middle);
        
        Scene scene = new Scene(root, 250, 300);
        
        primaryStage.setTitle("Java Games");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
