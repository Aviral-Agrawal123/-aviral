package com.cap.bean;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String username,passwd,name,confirmpass,address;
	private long mobile_no;
	private double amount;
	private static int acc_no=987632;
	private List<String> transactions;
	public List<String> getTransactions(){
		return transactions;
		
	}
	public Bank() {
		Bank.setAcc_no();
		transactions=new ArrayList<String>();
		
	}
	private static void setAcc_no() {
		Bank.acc_no = acc_no;
		
	}
	public void setTransaction(String transaction) {
		this.transactions.add(transaction);
	}
	

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getConfirmpass() {
		return confirmpass;
	}


	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public static int getAcc_no() {
		return acc_no;
	}


	


	

	
	
	
	
	
	
	
	public String toString() {
		return "Bank[Username="+username+",Password="+passwd+",Name="+name+",ConfirmPassword="+confirmpass+",address="+address+",mobile_number="+mobile_no+",amount="+amount+",Account_number="+acc_no+"]";
		
	}
}

