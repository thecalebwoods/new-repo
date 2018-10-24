package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Users.Accounts;
import Users.Customers;
import adminEmployees.Employees;


public class CustomerDao {

		
		    private static Customers loadCustomer(ResultSet rs) throws Exception{
		    	
		    	Customers user = new Customers();
				
				// Extract data from result set
				user.setID(rs.getInt("id"));
				user.setUser(rs.getString("user_name"));
				user.setPass(rs.getString("pass_word"));
				user.setNumber(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
				user.setName(rs.getString("full_name"));

				System.out.println(user);
				return user;
		    }
			
//
//		    public static void main(String[] args) {
//				
//		    	Customers user = new Customers();
//		    	
//		    	createCustomer(user);
//		    	
//			}
		    
		    public static ResultSet junctionCustAcc(Customers user, Accounts account){
		    	try (Connection conn = ConnectingBankUtil.getConnection()) {
					String query = "INSERT INTO junction (user_request, acc_receive) VALUES (?, ?) RETURNING id";
					PreparedStatement test = conn.prepareStatement(query);
					test.setLong(1, user.getID());
					test.setLong(2, account.getId());
					ResultSet rs = test.executeQuery();
					rs.next();
					rs.getInt("id");
					return rs;
		    	}catch (SQLException e) {
					e.printStackTrace();
				
					return null;
				}
		    }
		    
		    
		    
		    public static Accounts createAccount(Accounts acc) {
		    	try (Connection conn = ConnectingBankUtil.getConnection()) {
					String query = "INSERT INTO accounts (balance) VALUES (?) RETURNING id";
					PreparedStatement test = conn.prepareStatement(query);
					test.setDouble(1, acc.getBalance());
					
					ResultSet rs = test.executeQuery();
					rs.next();
					acc.setId(rs.getInt("id"));
					return acc;
		    	}catch (SQLException e) {
					e.printStackTrace();
				
					return null;
				}
			}
//		    
			public static Customers createCustomer(Customers users) {
				
				try (Connection conn = ConnectingBankUtil.getConnection()) {
					String query = "INSERT INTO customers (user_name, pass_word, phone, email, full_name, priv_acc) VALUES (?, ?, ?, ?, ?, ?) RETURNING id";
					PreparedStatement test = conn.prepareStatement(query);
					test.setString(1, users.getUser());
					test.setString(2, users.getPass());
					test.setString(3, users.getEmail());
					test.setString(4, users.getNumber());
					test.setString(5, users.getName());
					test.setInt(6, (int) users.getPrivID());

					
					// ResultSet starts before the first result, so we need to call next at least once
					ResultSet rs = test.executeQuery();
					rs.next();
					
					users.setID(rs.getInt("id"));					
					return users;
				} catch (SQLException e) {
					e.printStackTrace();
				
					return null;
				}
			}
			
			public static boolean isPassPresent(String pass) {
				boolean userExist = false;
				
				String query = "SELECT EXISTS(SELECT 1 FROM customers WHERE pass_word = ?)";
				try(Connection conn = ConnectingBankUtil.getConnection()) {
					PreparedStatement statement = conn.prepareStatement(query);
					statement.setString(1, pass);
					
					ResultSet resultSet = statement.executeQuery();
					
						return resultSet.next();
						
				}catch(SQLException e){
					e.printStackTrace();
					System.out.println("try again");
					return false;
				}
			}
			
			public static void getAllUser() {
				
				int x= 0;
				
				String query = "SELECT user_name FROM customers";
				try(Connection conn = ConnectingBankUtil.getConnection()) {
					PreparedStatement statement = conn.prepareStatement(query);
					
					ResultSet resultSet = statement.executeQuery();
					
						while(resultSet.next()) {
							x++;
							System.out.println("+++++     " + x + ". "+ resultSet.getString("user_name"));
						}
						
				}catch(SQLException e){
					e.printStackTrace();
					System.out.println("try again");
					return;
				}
				
			}
			
			public static boolean isJointNull(String user) {
				boolean userExist = false;
				
				String query = "SELECT EXISTS(SELECT * FROM  customers WHERE user_name = ? AND joint_acc IS NULL)";
				try(Connection conn = ConnectingBankUtil.getConnection()) {
					PreparedStatement statement = conn.prepareStatement(query);
					statement.setString(1, user);
					
					ResultSet resultSet = statement.executeQuery();
					
						return resultSet.next();
						
				}catch(SQLException e){
					e.printStackTrace();
					System.out.println("try again");
					return false;
				}
			}
			
			public static boolean isJointPresent(long num) {
				boolean userExist = false;
				
				String query = "SELECT EXISTS(SELECT joint_acc FROM customers WHERE joint_acc = ?)";
				try(Connection conn = ConnectingBankUtil.getConnection()) {
					PreparedStatement statement = conn.prepareStatement(query);
					statement.setLong(1, num);
					
					ResultSet resultSet = statement.executeQuery();
					
						return resultSet.next();
						
				}catch(SQLException e){
					e.printStackTrace();
					System.out.println("try again");
					return false;
				}
			}
			
			public Employees getEmployById(long id) {
				try(Connection conn = ConnectingBankUtil.getConnection()){
					String query = "SELECT * FROM employees WHERE employee_id = ?";

					PreparedStatement statement = conn.prepareStatement(query);
					
					statement.setLong(1, id);
					
					ResultSet rs = statement.executeQuery();
					
					rs.next();
					
					Employees emp = new Employees();
					
					emp.setRegisterId(rs.getLong("employee_id"));
					emp.setPass(rs.getString("pass_word"));
					
					return emp;
				}catch(SQLException e){
					e.printStackTrace();
					return null;
				}
			}
			
			public static boolean isEmpPresent(long employ) {
				boolean empExist = false;
				
				String query = "SELECT EXISTS(SELECT 1 FROM employees WHERE employee_id = ?)";
				try(Connection conn = ConnectingBankUtil.getConnection()) {
					PreparedStatement statement = conn.prepareStatement(query);
					statement.setLong(1, employ);
					
					ResultSet resultSet = statement.executeQuery();
					
						return resultSet.next();
						
				}catch(SQLException e){
					e.printStackTrace();
					System.out.println("try again");
					return false;
				}
				
			}
			
			public static boolean isUserPresent(String user) {
				boolean userExist = false;
				
				String query = "SELECT EXISTS(SELECT 1 FROM customers WHERE user_name = ?)";
				try(Connection conn = ConnectingBankUtil.getConnection()) {
					PreparedStatement statement = conn.prepareStatement(query);
					statement.setString(1, user);
					
					ResultSet resultSet = statement.executeQuery();
					
						return resultSet.next();
						
				}catch(SQLException e){
					e.printStackTrace();
					System.out.println("try again");
					return false;
				}
				
			}
			
			public Accounts getAccountById(long id) {
				try(Connection conn = ConnectingBankUtil.getConnection()){
					String query = "SELECT * FROM accounts WHERE id = ?";

					PreparedStatement statement = conn.prepareStatement(query);
					
					statement.setLong(1, id);
					
					ResultSet rs = statement.executeQuery();
					
					rs.next();
					
					Accounts acc = new Accounts();
					
					acc.setId(rs.getLong("id"));
					acc.setBalance(rs.getDouble("balance"));
					
					return acc;
				}catch(SQLException e){
					e.printStackTrace();
					return null;
				}
			}
		    
			public Customers getCustomerByUserName(String userName) {
				try(Connection conn = ConnectingBankUtil.getConnection()){
					// DONT EVER DO THIS
//					String query = "SELECT * FROM users WHERE LOWER(first_name) = '" + firstName.toLowerCase()+"'";
					
					// DO THIS 
					
					String query = "SELECT * FROM customers WHERE LOWER(user_name) = ?";

					PreparedStatement statement = conn.prepareStatement(query);
					
					statement.setString(1, userName);
					
					ResultSet rs = statement.executeQuery();
					
					rs.next(); 
						//Create new user interface
						Customers user = new Customers();
						
						// Extract data from result set
						user.setID(rs.getInt("id"));
						user.setUser(rs.getString("user_name"));
						user.setPass(rs.getString("pass_word"));
						user.setNumber(rs.getString("phone"));
						user.setEmail(rs.getString("email"));
						user.setName(rs.getString("full_name"));
						user.setPrivID(rs.getInt("priv_acc"));
						user.setJoID(rs.getInt("joint_acc"));

					return user;
				}catch(SQLException e){
					e.printStackTrace();
					return null;
				}
			}

			public static void updateAcc(Accounts acc) {
				try (Connection conn = ConnectingBankUtil.getConnection()) {
					String query = "UPDATE accounts SET balance = ? WHERE id = ?";
					PreparedStatement ps = conn.prepareStatement(query);
					ps.setDouble(1, acc.getBalance());
					ps.setInt(2, (int) acc.getId());
					
					ps.execute();
					// ResultSet starts before the first result, so we need to call next at least once
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			public static void updateCust(Customers user) {
				try (Connection conn = ConnectingBankUtil.getConnection()) {
					String query = "UPDATE customers SET user_name = ?, pass_word = ?, phone = ?, email = ?, full_name = ?, priv_acc = ?, joint_acc = ? WHERE id = ?";
					PreparedStatement ps = conn.prepareStatement(query);
					ps.setString(1, user.getUser());
					ps.setString(2, user.getPass());
					ps.setString(3, user.getNumber());
					ps.setString(4, user.getEmail());
					ps.setString(5, user.getName());
					ps.setInt(6,(int) user.getPrivID());
					ps.setInt(7, (int) user.getJoID());
					ps.setInt(8, (int) user.getID());

					ps.execute();
					// ResultSet starts before the first result, so we need to call next at least once
				} catch (SQLException e) {
					e.printStackTrace();
				}		
			}

		}
	

