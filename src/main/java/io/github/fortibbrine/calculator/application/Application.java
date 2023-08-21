package io.github.fortibbrine.calculator.application;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Application extends javafx.application.Application {

    public Application() {}
    public Application(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox root = new HBox();

        root.setSpacing(20);

        Button button1 = new Button("hello world");
        Button button2 = new Button("hello");

        button1.setFont(new Font(30));
        button2.setFont(new Font(30));

        button1.setOnMouseClicked(event -> System.out.println("?"));

        button1.setStyle("-fx-background-color: white");
        button2.setStyle("-fx-background-color: white");

        root.getChildren().add(button1);
        root.getChildren().add(button2);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setHeight(400);
        primaryStage.setWidth(400);
        primaryStage.setTitle("My first javafx application");
        primaryStage.show();
    }


}
