package com.billdiary.ui;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.billdiary.dao.CreateSchema;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController extends Application{
	
	final static Logger LOGGER = Logger.getLogger(MainController.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.debug("Entering Class MainController : method : main.");
		try {
			CreateSchema.CreateDatabase();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		launch(args); 
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		/*
	      //Creating a scene object 
	      Scene scene =LoginController.getLoginStage(); 
	       
	      //Setting title to the Stage 
	      stage.setTitle("Bill Diary"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene);
	      
	      //Displaying the contents of the stage 
	      stage.show(); 
	      */
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Login.fxml"));
	    
        Scene scene = new Scene(root, 600, 600);
    
        stage.setTitle("Welcome to Application");
        stage.setScene(scene);
        stage.show();
		
	}
	
	
}
