package counter;

import java.security.PrivateKey;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int counter = 0;
	
	
	
	public void updateLabelNumber(Label label) {
		label.setText(Integer.toString(counter));
		
		label.getStyleClass().remove("red");
		label.getStyleClass().remove("green");
		
		if (counter < 0) {
			label.getStyleClass().add("red");
		} else if (counter > 0) {
			label.getStyleClass().add("green");
		}

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitle = new Label("Counter");
		Label labelNumber = new Label("0");
		labelNumber.getStyleClass().add("number");
		labelTitle.getStyleClass().add("title");


		Button buttonDecrement = new Button("-");
		buttonDecrement.getStyleClass().add("buttons");
		buttonDecrement.setOnAction(e -> {
			updateLabelNumber(labelNumber);
			counter--;
		});
		Button buttonIncrement = new Button("+");
		buttonIncrement.getStyleClass().add("buttons");

		buttonIncrement.setOnAction(e -> {
			updateLabelNumber(labelNumber);
			counter++;
			
		});

		HBox boxButtons = new HBox();
		boxButtons.setAlignment(Pos.CENTER);
		boxButtons.setSpacing(10);

		boxButtons.getChildren().add(labelTitle);
		boxButtons.getChildren().add(labelNumber);
		boxButtons.getChildren().add(buttonDecrement);
		boxButtons.getChildren().add(buttonIncrement);

		VBox boxContentVertical = new VBox();
		boxContentVertical.getStyleClass().add("content");
		boxContentVertical.getChildren().add(labelTitle);
		boxContentVertical.getChildren().add(labelNumber);

		boxContentVertical.getChildren().add(boxButtons);
		boxContentVertical.setAlignment(Pos.CENTER);
		boxContentVertical.setSpacing(10);

		String pathCssString = getClass().getResource("/counter/Counter.css").toExternalForm();
		Scene sceneOne = new Scene(boxContentVertical, 400, 400);
		sceneOne.getStylesheets().add(pathCssString);
		
		primaryStage.setScene(sceneOne);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
