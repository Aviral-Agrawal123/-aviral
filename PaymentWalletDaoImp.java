package dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

import bean.User;
import exception.ExceptionHandle;

public class PaymentWalletDaoImp implements PaymentWalletDao{

	HashMap<Integer, User> userAccountData = new HashMap<Integer, User>();
	

	
	@Override
	public Integer createUserAccount(Integer accountNo, String password,User user) {
		
		Set s = userAccountData.entrySet();
		Iterator iterator = s.iterator();
		boolean flag = true;
		
		while(iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			if(entry.getKey().equals(accountNo)) {
				flag = false;
				break;
				
			}
			else {
				flag = true;
			}
		}
		
		if(flag) {
			user = new User();
			user.setPassword(password);
			user.setAccountNo(accountNo);
			userAccountData.put(accountNo, user);
			
			
			user.setTransaction("Account created successfully:");
		}
		else {
			System.out.println("Account already exist");
		}
		
		return accountNo;
		
	}

	@Override
	public Integer showBalance(Integer accountNo, String password) {
		
		Set s = userAccountData.entrySet();
		Iterator iterator = s.iterator();
		boolean flag = true;
		Integer balance = 0;
		
		while(iterator.hasNext()){
			
			Entry entry = (Entry)iterator.next();
			if(entry.getKey().equals(accountNo)){
				User user = (User) entry.getValue();
					
				if(user.getPassword().equals(password))	{
					
						balance = user.getBalance();
						user.setTransaction("balance of account is: "+ balance);
						flag = false;
						break;
						
					}
					else {
						System.out.println("wrong password");
					}
				}			
		}
		
		if(flag) {
			System.out.println("wrong credentials");
			return null;
		}
		else 
		return balance;				
	}

	@Override
	public Integer depositAmount(Integer accountNo, String password, Integer amount) {
		
		Set s = userAccountData.entrySet();
		Iterator iterator = s.iterator();
		boolean flag = true;
		Integer balance = 0;
		
			while(iterator.hasNext()) {
				Entry entry = (Entry) iterator.next();
				
				if(entry.getKey().equals(accountNo)) {
					User user = (User) entry.getValue();
					if(user.getPassword().equals(password)) {
						flag = false;
					
						balance = user.getBalance();
						balance = balance + amount;
						user.setBalance(balance);
						userAccountData.put(accountNo, user);

						user.setTransaction(amount + " is deposited in your account");
						break;	
					}
				
				}
				
			}
		
		
		if(flag) {
			System.out.println("Wrong credentials");
		}
		return balance;
		
				
	}

	@Override
	public Integer withdrawAmount(Integer accountNo, String password, Integer amount) {
		
		Set s = userAccountData.entrySet();
		Iterator iterator = s.iterator();
		boolean flag = true;
		Integer balance = 0;
		
		while(iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();	
			if(entry.getKey().equals(accountNo)) {
				User user = (User) entry.getValue();
				if(user.getPassword().equals(password)) {
						
					flag = false;					
					balance = user.getBalance();
						
					if(amount<=balance ) {
						balance = balance - amount;
						user.setBalance(balance);
						userAccountData.put(accountNo, user);
						user.setTransaction(amount + " is wihdraw from your account");	
					}
					else {
						System.out.println("amount should be greater than balance");
					}		
				}
				
			}
		}
		
		if(flag) {
			System.out.println("Wrong credentials");
		}
		
		return balance;
		
	}

	@Override
	public Integer fundTransfer(Integer accountNo, String password, Integer destAccountNo, Integer amount) throws ExceptionHandle {
		
				Set s = userAccountData.entrySet();
				Iterator iterator = s.iterator();
				Iterator iterator2 = s.iterator();
				Integer balance = 0;
				boolean flag = true;
				
				try {
				while(iterator.hasNext()) {
					Entry entry = (Entry) iterator.next();
				
			
						if(accountNo.equals(destAccountNo)) {
							throw new ExceptionHandle("You cannot transfer money in same account.");
						}
					
					
						if(entry.getKey().equals(accountNo) && userAccountData.containsKey(destAccountNo)) {
						User user = (User) entry.getValue();
						
						if(user.getPassword().equals(password)) {	
							flag = false;
							balance = user.getBalance();
							
							if(amount>balance) {
								throw new ExceptionHandle("amount should be less than balance");
							}
								
							balance = withdrawAmount(accountNo, password, amount);
							depositAmount(destAccountNo, password, amount);
							System.out.println("successfully transfer!!");
									
						}
					}
				}
				
				if(flag) {
					System.out.println("Wrong credentials");
				}
			}
			catch(ExceptionHandle e) {
				System.out.println("Error :" + e.getMessage());
			}
	
			
						
		return balance;	
		
			
	}
		

			
	@Override
	public void getUserAccountDetails(Integer accountNo, String password) {
		
		Set s = userAccountData.entrySet();
		Iterator iterator = s.iterator();
		String accountPassword = "";
		double balance = 0;
		boolean flag = true;
		
		while(iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			if(entry.getKey().equals(accountNo))
			{
				User user = (User) entry.getValue();
				if(user.getPassword().equals(password)) {
					accountPassword = user.getPassword();
					balance = user.getBalance();
					flag = false;
					break;
				}
			}
			
		}
		if(flag) {
			System.out.println("wrong credentials");
		}
		else {
			System.out.print("Account Number: " + accountNo + "\nAccount Balance: " + balance);
		}
		
		
	}

	@Override
	public void printTransaction(Integer accountNo, String password) {
		
		Set s = userAccountData.entrySet();
		Iterator iterator = s.iterator();
		String accountPassword = "";
		double balance = 0;
		boolean flag = true;
		String Transaction = " ";
		
		while(iterator.hasNext()) {
			Entry e = (Entry) iterator.next();
			if(e.getKey().equals(accountNo)) {
				User user = (User)e.getValue();
				if(user.getPassword().equals(password))
				{
					password = user.getPassword();
					balance = user.getBalance();
					Transaction = user.getTransaction();
					flag = false;
				}
			}
		}
		if(flag) {
			System.out.println("Wrong credentials");
		}
		else {
			System.out.println("All Transactions of:" + accountNo);
			System.out.println(Transaction);
		}
	}

	
}
