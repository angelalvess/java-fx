package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		URL fileFXML = getClass().getResource("/fxml/Login.fxml");
		GridPane raiz = FXMLLoader.load(fileFXML);
		
		Scene sceneOne= new Scene(raiz, 200,200);
		
		primaryStage.setResizable(false);
		
		primaryStage.setScene(sceneOne);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
