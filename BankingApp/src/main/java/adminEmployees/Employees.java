package adminEmployees;
import Users.Customers;
import Utilities.Saveable;

public class Employees extends Customers implements Saveable {
	long registerId;
	String password;
	
	public long getRegisterId() {
		return registerId;
	}
	public void setRegisterId(long registerId) {
		this.registerId = registerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employees [registerId=" + registerId + ", password=" + password + "]";
	}
	@Override
	public Object getUserFolderName() {
		return "./Users/";
	}
	@Override
	public Object getUserFileName() {
		return (this.getUser() + ".ser");
	}
}
	
	

