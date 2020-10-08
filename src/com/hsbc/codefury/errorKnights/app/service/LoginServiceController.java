package com.hsbc.codefury.errorKnights.app.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.codefury.errorKnights.app.dao.CustomerDao;
import com.hsbc.codefury.errorKnights.app.dao.CustomerDaoImpl;

public class LoginServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServiceController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String action = request.getParameter("action");
		CustomerDao custDao = new CustomerDaoImpl();

		if (action.equals("Login")) {
			String uname = request.getParameter("uname");
			String pwd = request.getParameter("pwd");

			if (uname.equals("") || pwd.equals("")) {
//				response.sendRedirect("/BankApplication/login.html"); // Basic Page
				response.sendRedirect("/BankApplication/login2.html"); // with UI
			} else {
				
				BankAppService service = new BankAppService(custDao);

				// login method invoked
				String loginStatus = service.loginCustomer(uname, pwd);

				switch (loginStatus) {
				case "success":
					response.sendRedirect("/BankApplication/success.jsp?Welcome");
					break;
				case "wrongCredentials":
					response.sendRedirect("/BankApplication?InvalidCredentials");
					break;
//				case "wrongPassword":
//					response.sendRedirect("/BankApplication?WrongPassword");
//					break;
//				case "noCustomer":
//					response.sendRedirect("/BankApplication?CustomerNotFound");
//					break;
				default:
					response.sendRedirect("/BankApplication?PleaseEnterCredentials");
					break;
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
