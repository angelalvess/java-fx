module javafx {
	
	requires javafx.controls;
	requires javafx.fxml;
	
	opens basic;
	opens counter;
	opens projects;
	opens fxml;
}