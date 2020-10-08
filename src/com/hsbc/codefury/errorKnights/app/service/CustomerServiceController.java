package com.hsbc.codefury.errorKnights.app.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.codefury.errorKnights.app.dao.CustomerDao;
import com.hsbc.codefury.errorKnights.app.dao.CustomerDaoImpl;

/**
 * Servlet implementation class CustomerServiceController
 */
public class CustomerServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String action = request.getParameter("action");
		CustomerDao custDao = new CustomerDaoImpl();

		if (action.equals("transact")) {
			String senderAccId = request.getParameter("senderAccId");
			String receiverAccId = request.getParameter("receiverAccId");
			Double amount = Double.parseDouble(request.getParameter("amount"));

			BankAppService service = new BankAppService(custDao);

			// transaction method invoked
			String transStatus = service.transaction(senderAccId, receiverAccId, amount);

			request.getSession().setAttribute("transStatus", transStatus);
			request.getRequestDispatcher("transaction-status.jsp").forward(request, response);
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
