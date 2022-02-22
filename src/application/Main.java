package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Load the fxml file
			Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
			
			Scene scene = new Scene(root,506,316);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//Set Title
			primaryStage.setTitle("Hello Fx");
			
			//Set Icon
			Image icon = new Image(getClass().getResourceAsStream("star.png"));
			primaryStage.getIcons().add(icon);
			
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
