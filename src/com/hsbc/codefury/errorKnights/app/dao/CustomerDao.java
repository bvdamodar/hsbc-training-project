/**
 * 
 */
package com.hsbc.codefury.errorKnights.app.dao;

import com.hsbc.codefury.errorKnights.app.entity.Customer;

/**
 * @author Error Knights
 *
 */
public interface CustomerDao {
	String accountRequest(String custId);

	String customerRegister(Customer cust);

	String customerLogin(String uname, String pwd);

	String viewProfile(String custId);

	boolean doTransaction(String senderAccId, String receiverAccId, double amt);

	String viewTransactions(String custId);
}
