package com.hsbc.codefury.errorKnights.app.entity;

public class Account {
	private String accId; // 12 digit
	private String custId;
	private String openingDate;
	private String accType;
	private double balance;
	private double minBalance;

	public Account() {
	}

	public Account(String accId, String custId, String openingDate, String accType, double balance, double minBalance) {
		this.accId = accId;
		this.custId = custId;
		this.openingDate = openingDate;
		this.accType = accType;
		this.balance = balance;
		this.minBalance = minBalance;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "accId=" + accId + ", custId=" + custId + ", openingDate=" + openingDate + ", accType=" + accType
				+ ", balance=" + balance + ", minBalance=" + minBalance;
	}

}
