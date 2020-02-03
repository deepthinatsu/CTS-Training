package com.controller;

		public class LoginService {
			public String validateLogin(String user,String pass) {
			String result=null;
			LoginDAO loginDao=new LoginDAO();
			if(loginDao.validateUser(user, pass))
			{
			result="success";
			}
			else
			result="failure" ;
			return result;
			}

			}