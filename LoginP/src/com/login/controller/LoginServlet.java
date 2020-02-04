package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.LoginPojo;
import com.login.service.LoginService;

//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("userName");
		String password = request.getParameter("password");

		LoginPojo loginPojo = new LoginPojo();
		loginPojo.setUserName(username);
		loginPojo.setPassword(password);

		LoginService loginService = new LoginService();
		LoginPojo returnLoginPojo = loginService.validateLogin(loginPojo);

		if (returnLoginPojo.getRole() == null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("error", "Invalid username/Password");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Result.jsp");
			request.setAttribute("loginDetails", returnLoginPojo);
			requestDispatcher.forward(request, response);
		}
		/*
		 * PrintWriter out = response.getWriter(); LoginService loginService = new
		 * LoginService(); String result = loginService.validateLogin(username,
		 * password);
		 * 
		 * 
		 * 
		 * 
		 * RequestDispatcher requestDispatcher =
		 * request.getRequestDispatcher("Result.jsp"); //request.setAttribute("result",
		 * result); requestDispatcher.forward(request, response);
		 */
		/*
		 * if (username.equals("admin") && password.equals("Admin")) { //
		 * requestDispatcher = request.getRequestDispatcher("Success.html");
		 * 
		 * // out.println("<h2><font color='green'>Login Successful!</font></h2>");
		 * 
		 * request.setAttribute("Result", "success"); }
		 * 
		 * else { // requestDispatcher = request.getRequestDispatcher("Failure.html");
		 * 
		 * // out.println("<h2><font color='red'>Login Failure!</font></h2>");
		 * 
		 * request.setAttribute("Result", "failure"); }
		 */
		// requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
