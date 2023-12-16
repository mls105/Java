package com.me.CodeApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;


/**
 * Hello world!
 *
 */
public class App extends Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,400,400);
//		scene.getStylesheets().add(getClass().getResource("application.css"));
		
		
	}
    
 
}


