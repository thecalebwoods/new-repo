package Users;

import Utilities.Saveable;

public class Customers implements Saveable{

	private String user;
	private String pass;
	private String name;
	private String email;
	private String ssn;
	private String number;
	private int id;
	private long privID;
	private long joID;
	private boolean isCreated;
	
	
	
	
	public long getPrivID() {
		return privID;
	}
	public void setPrivID(long privID) {
		this.privID = privID;
	}
	public long getJoID() {
		return joID;
	}
	public void setJoID(long l) {
		this.joID = l;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public long getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public boolean isCreated() {
		return isCreated;
	}
	public void setCreated(boolean isCreated) {
		this.isCreated = isCreated;
	}
	
	
	
	
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(String user, String pass, String name, String email, String ssn, String number, int id,
			long joID, boolean isCreated) {
		super();
		this.user = user;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.ssn = ssn;
		this.number = number;
		this.id = id;
		this.joID = joID;
		this.isCreated = isCreated;
	}
	
	@Override
	public String toString() {
		return "Customers [user=" + user + ", pass=" + pass + ", name=" + name + ", email=" + email + ", ssn=" + ssn
				+ ", number=" + number + ", id=" + id + ", privID=" + privID + ", joID=" + joID + ", isCreated="
				+ isCreated + "]";
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + (isCreated ? 1231 : 1237);
		result = prime * result + (int) (joID ^ (joID >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + (int) (privID ^ (privID >>> 32));
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (isCreated != other.isCreated)
			return false;
		if (joID != other.joID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (privID != other.privID)
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	public Object getUserFolderName() {
		return "./Users/";
	}
	public Object getUserFileName() {
		return (this.getUser() + ".ser");
	}


	
	
}
