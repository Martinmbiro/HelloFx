package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LoginController {
	@FXML
	private Button confirmButton;
	@FXML
	private ImageView imageView;
	@FXML
	private Label label;
	@FXML
	private PasswordField passwordField;
	@FXML
	private TextField userNameField;
	
	Image errorIcon = new Image(getClass().getResourceAsStream("error.png"));
	Image successIcon = new Image(getClass().getResourceAsStream("check.png"));
	
	//Set Event on Button
	public void onButtonClick() {
		//System.out.println("Button Clicked");
		//Check if UserName and Password are null
		if(userNameField.getText().toString() == "" || passwordField.getText().toString() == "") {
			label.setText("Enter All Credentials");
			imageView.setImage(errorIcon);
		}else {
			//Otherwise get text from both fields
			String userName = userNameField.getText().toString().toLowerCase();
			String password = passwordField.getText().toString().toLowerCase();
			
			//If the UserName and password are same
			if(userName.equals(password)) {
				imageView.setImage(successIcon);
				passwordField.setText(null);
				label.setText("Successfully Confirmed!");
			}else {
				imageView.setImage(errorIcon);
				passwordField.setText(null);
				label.setText("Wrong Credentials");
			}
			
		}
	}
}
