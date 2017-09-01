package com.billdiary.service;

import org.apache.log4j.Logger;

import com.billdiary.dao.LoginDAO;
import com.billdiary.model.User;

public class LoginService {
	
	final static Logger LOGGER = Logger.getLogger(LoginService.class);
	
	public LoginDAO loginDAO;
	
	public boolean doLogin(User user)
	{
		LOGGER.debug("In method LoginService:doLogin Entry ");
		boolean userLogged=false;
		loginDAO=new LoginDAO();
		if(loginDAO.doLogin(user))
		{
			userLogged=true;
		}else {
			userLogged=false;
		}
		
		LOGGER.debug("In method LoginService:doLogin Exit ");
		return userLogged;
		
	}

}
