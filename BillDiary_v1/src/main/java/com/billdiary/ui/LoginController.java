package com.billdiary.ui;



import org.apache.log4j.Logger;
import com.billdiary.model.User;
import com.billdiary.service.LoginService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class LoginController {
	
	final static Logger LOGGER = Logger.getLogger(LoginController.class);
	
	private LoginService loginService;
	private User user;
	
	@FXML private Text actiontarget;
	@FXML private TextField textField;
	@FXML private PasswordField passwordField;
	
    
    @FXML protected void handleSignInButtonAction(ActionEvent event) {
    	
    	LOGGER.debug("In method LoginController:handleSignInButtonAction Entry ");
    	
    	loginService=new LoginService();
    	user=new User();
    	String userName=textField.getText();
    	String password=passwordField.getText();
    	if(userName!=null && password!=null)
    	{
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
