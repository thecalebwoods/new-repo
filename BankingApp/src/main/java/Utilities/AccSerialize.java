package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Users.Accounts;

public class AccSerialize {

	public static void saveAccFile(Accounts id){
		//location : get.getfolder +"/" user.username + .ser
		File file = new File("./Accounts" + "/" +id.getId()+".ser");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			
			oos.writeObject(id);;
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Saved!");
	}
	
		
	 public static Accounts loadAccFile(long id){
		File file = new File("./Accounts" + "/" + id +".ser");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			return (Accounts) ois.readObject();
		} catch(IOException | ClassCastException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		return null;
	 }
	
	
}
