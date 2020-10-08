package com.hsbc.codefury.errorKnights.app.entity;

public class Transaction {
	String transId; // 12 digit
	String accId;
	String amount;
	String timeStamp;
	String transType; // credit/debit
	String remarks; // status

	public Transaction() {
	}

	public Transaction(String transId, String accId, String amount, String timeStamp, String transType,
			String remarks) {
		this.transId = transId;
		this.accId = accId;
		this.amount = amount;
		this.timeStamp = timeStamp;
		this.transType = transType;
		this.remarks = remarks;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "transId=" + transId + ", accId=" + accId + ", amount=" + amount + ", timeStamp=" + timeStamp
				+ ", transType=" + transType + ", remarks=" + remarks;
	}

}
