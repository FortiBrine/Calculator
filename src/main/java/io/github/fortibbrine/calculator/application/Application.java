package io.github.fortibbrine.calculator.application;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
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
        Text text = new Text("hello world");
        text.setFont(new Font(20));

        StackPane root = new StackPane();
        root.getChildren().add(text);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setHeight(400);
        primaryStage.setWidth(400);
        primaryStage.setTitle("My first javafx application");
        primaryStage.show();
    }


}
