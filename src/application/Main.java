package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			DBAccess.connectToDB() ;
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Login_view.fxml"));
			Scene scene = new Scene(root,500,500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Hostel Management");
			primaryStage.getIcons().add(new Image(getClass().
					getResourceAsStream("javaFXLogo.png")));
			primaryStage.show();
			primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
				
				@Override
				public void handle(WindowEvent arg0) {
					// TODO Auto-generated method stub
					DBAccess.disconnectToDB();
				}
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
