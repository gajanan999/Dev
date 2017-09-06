package com.billdiary.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.billdiary.config.SpringFxmlLoader;
import com.billdiary.model.Product;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
@Controller("HomeController")
public class HomeController {
	
	
	
	@Autowired
	private Product product;
	
	@FXML
	private TableView<Product> tbid;
	@FXML
	private TableColumn<Product,Integer>id;
	@FXML
	private TableColumn<Product,String>name;
	
	@FXML
	private TableColumn<Product,Float>price;
	@FXML javafx.scene.control.MenuItem page1;
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
	 final ObservableList<Product> data=FXCollections.observableArrayList(
			 new Product(1,"gajanan",(float) 3.8),
				new Product(2,"akshay",(float) 3.6)
				);
	@FXML
	public void initialize() {
		// TODO Auto-generated method stub
		
		id.setCellValueFactory(new PropertyValueFactory<Product,Integer>("id"));
		
		name.setCellValueFactory(new PropertyValueFactory<Product,String>("name"));
		price.setCellValueFactory(new PropertyValueFactory<Product,Float>("price"));
		//balance.setCellValueFactory(new PropertyValueFactory<BillInfo,Float>("balance"));
		tbid.setItems(data);
	}
}
