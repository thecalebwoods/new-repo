package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import adminEmployees.Employees;

public class EmpSerializer {

	public static void saveEmpFile(Employees id){
		//location : get.getfolder +"/" user.username + .ser
		File file = new File(id.getUserFolderName() + "/" + id.getUser() +".ser");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			
			oos.writeObject(id);;
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Saved!");
	}
	
		
	 public static Employees loadEmpFile(long id){
		File file = new File("./Users" + "/" + id +".ser");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			return (Employees) ois.readObject();
		} catch(IOException | ClassCastException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		return null;
	 }
	
	
}
