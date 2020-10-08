package com.hsbc.codefury.errorKnights.app.entity;

public class Customer {
	private String custId;
	private String custName;
	private String custAddress;
	private String mobile;
	private String email;
	private String altMobile;
	private String altEmail;
	private String pan;
	private String dob;
	private String uname;
	private String pwd;
	private String lastLogin;

	public Customer() {
	}

	public Customer(String custId, String custName, String custAddress, String mobile, String email, String altMobile,
			String altEmail, String pan, String dob, String uname, String pwd, String lastLogin) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.mobile = mobile;
		this.email = email;
		this.altMobile = altMobile;
		this.altEmail = altEmail;
		this.pan = pan;
		this.dob = dob;
		this.uname = uname;
		this.pwd = pwd;
		this.lastLogin = lastLogin;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAltMobile() {
		return altMobile;
	}

	public void setAltMobile(String altMobile) {
		this.altMobile = altMobile;
	}

	public String getAltEmail() {
		return altEmail;
	}

	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Override
	public String toString() {
		return "custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", mobile=" + mobile
				+ ", email=" + email + ", altMobile=" + altMobile + ", altEmail=" + altEmail + ", pan=" + pan + ", dob="
				+ dob + ", uname=" + uname + ", pwd=" + pwd + ", lastLogin=" + lastLogin;
	}

}
