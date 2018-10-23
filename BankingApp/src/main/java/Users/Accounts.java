package Users;

import java.io.Serializable;

public class Accounts implements Serializable{

	private double balance;
	private long Id;

	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "Accounts [balance=" + balance + ", Id=" + Id + "]";
	}
	
	
	
	
}
	
	
	

