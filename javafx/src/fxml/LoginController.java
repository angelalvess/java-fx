package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {

	
	@FXML
	private TextField emailField;
	
	@FXML
	private TextField passwordField;
	
	public void open() {
		System.out.println("Email: " + emailField.getText());
		System.out.println("Password: " + passwordField.getText());
		
	}
	
}
