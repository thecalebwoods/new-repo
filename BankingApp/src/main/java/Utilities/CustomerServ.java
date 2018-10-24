package Utilities;

import java.util.List;

import Users.Accounts;
import Users.Customers;
import adminEmployees.Employees;;

public class CustomerServ {

	CustomerDao custDao = new CustomerDao();
	
	
	
	public Customers save(Customers user) {
		return custDao.createCustomer(user);
	}

	public Accounts save(Accounts user) {
		return custDao.createAccount(user);
	}
	
	public Customers signInCust(String cust) {
		return custDao.getCustomerByUserName(cust);
	}
	public Accounts getAccID(long id) {
		return custDao.getAccountById(id);
	}
	public Employees getEmpID(long id) {
		return custDao.getEmployById(id);
	}
	
	public boolean userExist(String user) {
		return custDao.isUserPresent(user);
	}
	public boolean passExist(String pass) {
		return custDao.isPassPresent(pass);
	}
	
	public boolean empExist(long employ) {
		return custDao.isEmpPresent(employ);
	}
//	public Accounts load(Accounts user) {
//		return custDao.(user);
//	}

}

