package com.billdiary.ui;

import org.springframework.stereotype.Controller;

import com.billdiary.config.SpringFxmlLoader;
import com.billdiary.model.Product;

import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

@Controller("MenuBarController")
public class MenuBarController {
	
	@FXML private void Openpage1()
	{
		SpringFxmlLoader loader=MainController.getLoader();
		GridPane a=(GridPane) loader.load("/fxml/page1.fxml");
		BorderPane border=LoginController.getRoot();
		border.setCenter(a);
		
		 
	}
	@FXML private void Openpage2()
	{
		SpringFxmlLoader loader=MainController.getLoader();
		GridPane a=(GridPane) loader.load("/fxml/page1.fxml");
		BorderPane border=LoginController.getRoot();
		border.setCenter(a);
		 
	}
	@FXML
	public void initialize() {
		// TODO Auto-generated method stub
		/*
		id.setCellValueFactory(new PropertyValueFactory<Product,Integer>("id"));
		
		name.setCellValueFactory(new PropertyValueFactory<Product,String>("name"));
		price.setCellValueFactory(new PropertyValueFactory<Product,Float>("price"));
		//balance.setCellValueFactory(new PropertyValueFactory<BillInfo,Float>("balance"));
		tbid.setItems(data);*/
	}

}
