package com.login.service;

import com.login.dao.LoginDAO;
import com.login.model.LoginPojo;

public class LoginService {
	
	public LoginPojo validateLogin(LoginPojo loginPojo) {
		LoginDAO loginDao = new LoginDAO();
		return loginDao.validateUser(loginPojo);
		//LoginPojo returnLoginPojo = loginDao.validateUser(loginPojo);
		//return returnLoginPojo;
	}

}