package com.cap.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public boolean validateUName(String uname) {
		Pattern pattern=Pattern.compile("[A-Za-z0-9]{4,12}");
		Matcher mat=pattern.matcher(uname);
		return mat.matches();
		
	}
	
	public boolean validatePassword(String password)
	{
		Pattern pattern=Pattern.compile("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})");
		Matcher mat=pattern.matcher(password);
		return mat.matches();
		
	}
	
	public boolean ConfirmPassword(String pwd1,String pwd2) {
		if(pwd1.equals(pwd2))
		{
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public boolean validateAddress(String address) {
		Pattern pattern=Pattern.compile("[A-Za-z0-9](2,}");
		Matcher mat=pattern.matcher(address);
		return mat.matches();
		
	}

	public boolean validateCustomer(String cust_name) {
		Pattern pattern=Pattern.compile("[A-Za-z]{4,}");
		Matcher mat=pattern.matcher(cust_name);
		
		return mat.matches();
	}

	public boolean validateMobile(long mobile_no) {
		String str=Double.toString(mobile_no);
		Pattern pattern=Pattern.compile("[0-9]{10}");
		Matcher mat=pattern.matcher(str);
		
		
		return mat.matches();
	}

	public boolean validateAccNo(int acc_no) {
		Pattern pattern=Pattern.compile("[0-9]{6}");
		Matcher m=pattern.matcher(Integer.toString(acc_no));
		return m.matches();
	}
	public boolean validateAccBal(Double account_bal) {
		String str2=Double.toString(account_bal);
		Pattern pattern=Pattern.compile("[0-9]{2,}");
		Matcher mat=pattern.matcher(str2);
		
		
		return mat.matches();
		
	}
	

}
