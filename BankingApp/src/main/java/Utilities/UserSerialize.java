package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Users.Customers;

public class UserSerialize {
	
		
	public static void saveUserFile(Customers user){
		//location : get.getfolder +"/" user.username + .ser
		File file = new File(user.getUserFolderName() + "/" + user.getUser() +".ser");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			
			oos.writeObject(user);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Saved!");
	}
	
		
	 public static Customers loadUserFile(String user){
		File file = new File("./Users/" + user +".ser");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			return (Customers)ois.readObject();
		} catch(IOException | ClassCastException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return null;
	 }
}