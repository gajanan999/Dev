package com.billdiary.ui;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;

import com.billdiary.model.User;
import com.billdiary.service.LoginService;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


@Controller("LoginController")
public class LoginController {
	
	final static Logger LOGGER = Logger.getLogger(LoginController.class);
	
	// Reference to the main application
    @SuppressWarnings("unused")
    private MainController mainController;
	
	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

	@Autowired
	private LoginService loginService;
	
	
	
	@Autowired
	private User user;
	
	@FXML private Text actiontarget;
	@FXML private TextField textField;
	@FXML private PasswordField passwordField;
	
	
	
	public LoginController()
	{
		
	}
    
    @FXML protected void handleSignInButtonAction(ActionEvent event) {
    	
    	LOGGER.debug("In method LoginController:handleSignInButtonAction Entry ");
    	
    	
    	
    	String userName=textField.getText();
    	String password=passwordField.getText();
    	System.out.println("dffsdfds");
    	if(userName!=null && password!=null)
    	{
    		System.out.println("dfdsfd");
    		user.setUserName(userName);
    		user.setPassword(password);
    		if(loginService.doLogin(user))
    		{
    			actiontarget.setText("Login Successfull");
    		}
    		else {
    			actiontarget.setText("Login failed");
    		}
    			
    		
    	}else
    	{
    		actiontarget.setText("UserName & Password cannot be valid");
    	}
    	
    	LOGGER.debug("In method LoginController:handleSignInButtonAction Exit ");
        
    }
	
	 
	
}
