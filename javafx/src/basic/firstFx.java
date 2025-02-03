package basic;

import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class firstFx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button buttonOne = new Button("one");
		Button buttonTwo = new Button("two");
		Button buttonTree = new Button("tree");
		
		buttonTree.setOnAction(e -> System.exit(0));
		
		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER);
		vBox.setSpacing(10);
		vBox.getChildren().add(buttonOne);
		vBox.getChildren().add(buttonTwo);
		vBox.getChildren().add(buttonTree);
		
		Scene principalScene  = new Scene(vBox, 200, 200);
		primaryStage.setScene(principalScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
