package Project;

import java.util.HashMap;

import Project.BankBean;

public class BankDao {
	
	BankBean beankBeanObj;
	
	HashMap<Long, BankBean> hm = new HashMap<Long, BankBean>();
	
	public void addCustomer(BankBean beankBeanObj) {			// METHOD TO ADD A CUSTOMER 
		this.beankBeanObj = beankBeanObj;						// BY SAVING THE BANK BEAN OBJECT
		hm.put(beankBeanObj.getAccNo(), beankBeanObj);			// IN HASH MAP
	}
	
	public HashMap<Long, BankBean> hm(){						// METHOD TO RETURN HASH MAP OBJECT
		return hm;
	}
}
