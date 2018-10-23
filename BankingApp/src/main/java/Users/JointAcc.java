package Users;

import java.io.Serializable;

public class JointAcc implements Serializable {

	private String jointName;
	private long jAccID;
	private long balance;
	
	
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getJointName() {
		return jointName;
	}
	public void setJointName(String jointName) {
		this.jointName = jointName;
	}
	public long getjAccID() {
		return jAccID;
	}
	public void setjAccID(long jAccID) {
		this.jAccID = jAccID;
	}
	
	@Override
	public String toString() {
		return "JointAcc [jointName=" + jointName + ", jAccID=" + jAccID + ", balance=" + balance + "]";
	}
	
	
	
	

	
	
}
