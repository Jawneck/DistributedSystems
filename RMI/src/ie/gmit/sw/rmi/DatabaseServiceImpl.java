package ie.gmit.sw.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ie.gmit.sw.Model.Booking;
import ie.gmit.sw.Model.Customer;
import ie.gmit.sw.Model.Vehicle;

public class DatabaseServiceImpl extends UnicastRemoteObject implements DatabaseService{
	
	private Connection connection;
	private Statement statement;

	private static final long serialVersionUID = 1L;

	protected DatabaseServiceImpl() throws RemoteException, SQLException {
		super();
		//Setting up connection to database
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carhirebooking?useSSL=false","root","");
	}
	
	////////////////////////////////////////////////////////
	//CRUD(Create, Read, Update, Delete) methods for Booking
	////////////////////////////////////////////////////////
	
	@Override
	//Show all current orders
	public List<Booking> readBooking() throws SQLException,RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Read booking");
		
		statement = connection.createStatement();
		
		List<Booking> List = new ArrayList<Booking>();
		String Select = "select * from booking";
		
		ResultSet rs = statement.executeQuery(Select);
		
		while (rs.next()) { 
			int BookingID = rs.getInt("BookingID");
			int CustomerID = rs.getInt("CustomerID");
			int CarID = rs.getInt("CarID");
			Date PickupDate = rs.getDate("PickupDate");
			Date DropoffDate = rs.getDate("DropoffDate");
			
			Booking s = new Booking(BookingID,CustomerID,CarID,PickupDate,DropoffDate);
					
			List.add(s);
		}
		return List;
	}
	
	@Override
	public void createBooking(Booking booking)throws RemoteException, SQLException{
		
		String Create = "insert into booking (BookingID, CustomerID, CarID, PickupDate, DropoffDate)" + "values (?,?,?,curdate(),curdate())";
		
		PreparedStatement preparedStmt = connection.prepareStatement(Create);
		preparedStmt.setInt (1, booking.getBookingID());
		preparedStmt.setInt (2, booking.getCustomerID());
		preparedStmt.setInt (3, booking.getCarID());
//		preparedStmt.setDate(4, (java.sql.Date) booking.getPickupDate());
//		preparedStmt.setDate(5, (java.sql.Date) booking.getDropoffDate());

		preparedStmt.execute();
		preparedStmt.close();
		
		/*
		String Create = "insert into booking (BookingID, CustomerID, CarID, PickupDate, DropoffDate) values ('6','6','6',2018-12-12,2018-12-19)";
		
		statement = connection.createStatement();
		System.out.println(statement);
		statement.execute(Create);
		System.out.println("Created");
		*/

	}
	
	@Override
	public void deleteBooking(Booking booking) throws RemoteException, SQLException{
		
		String Delete = "delete from booking where BookingID=?";
		
		PreparedStatement preparedStmt = connection.prepareStatement(Delete);
		preparedStmt.setInt(1, booking.getBookingID());
		preparedStmt.execute();
		preparedStmt.close();
		
		/*
		String Delete = "delete from booking where BookingID='2'";
		
		statement = connection.createStatement();
		System.out.println(statement);
		statement.execute(Delete);
		System.out.println("Deleted");
		*/

	}
	
	@Override
	public void updateBooking(Booking booking) throws RemoteException, SQLException{
		
		String Update = "update booking set CustomerID= ?, CarID= ? where BookingID= ?";
		
	    PreparedStatement preparedStmt = connection.prepareStatement(Update);
		preparedStmt.setInt(1, booking.getCustomerID());
		preparedStmt.setInt(2, booking.getCarID());
		preparedStmt.setInt(3, booking.getBookingID());
		preparedStmt.execute();
		preparedStmt.close();
		
		/*
		String Update = "update booking set CustomerID= '4', CarID= '9' where BookingID= '2'";
		
		statement = connection.createStatement();
		System.out.println(statement);
		statement.execute(Update);
		System.out.println("Updated");
		*/
	}
	
	/////////////////////////////////////////////////////////
	//CRUD(Create, Read, Update, Delete) methods for Customer
	/////////////////////////////////////////////////////////
	
	@Override
	//Show all current orders
	public List<Customer> readCustomer() throws SQLException,RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Read customer");
		
		statement = connection.createStatement();
		
		List<Customer> List = new ArrayList<Customer>();
		String Select = "select * from customer";
		
		ResultSet rs = statement.executeQuery(Select);
		
		while (rs.next()) { 
			int CustomerID = rs.getInt("CustomerID");
			String FirstName = rs.getString("FirstName");
			String LastName = rs.getString("LastName");
			String Town = rs.getString("Town");
			int LicenceNum = rs.getInt("LicenceNum");
			
			Customer s = new Customer(CustomerID,FirstName,LastName,Town,LicenceNum);
					
			List.add(s);
		}
		return List;
	}
	
	@Override
	public void createCustomer(Customer customer)throws RemoteException, SQLException{
		
		
		String Create = "insert into customer (CustomerID, FirstName, LastName, Town, LicenceNum)" + "values (?,?,?,?,?)";
		
		PreparedStatement preparedStmt = connection.prepareStatement(Create);
		preparedStmt.setInt (1, customer.getCustomerID());
		preparedStmt.setString (2, customer.getFirstName());
		preparedStmt.setString (3, customer.getLastName());
		preparedStmt.setString(4, customer.getTown());
		preparedStmt.setInt(5, customer.getLicenceNum());

		preparedStmt.execute();
		System.out.println("Created");
		preparedStmt.close();
		
		/*
		String Create = "insert into customer (CustomerID, FirstName, LastName, Town, LicenceNum) values ('4','Michael','Dunne','Trim','112421782')";
				
		statement = connection.createStatement();
		System.out.println(statement);
		statement.execute(Create);
		System.out.println("Created");
		*/
	}
	
	@Override
	public void deleteCustomer(Customer customer) throws RemoteException, SQLException{
		
		String Delete = "delete from customer where CustomerID= ?";
		
		PreparedStatement preparedStmt = connection.prepareStatement(Delete);
		preparedStmt.setInt(1, customer.getCustomerID());
		preparedStmt.execute();
		
		/*
		String Delete = "delete from customer where CustomerID= '1'";
		
		statement = connection.createStatement();
		System.out.println(statement);
		statement.execute(Delete);
		System.out.println("Deleted");
		*/
	}
	
	@Override
	public void updateCustomer(Customer customer) throws RemoteException, SQLException{
		
		String Update = "update customer set FirstName= ?, LastName= ?, Town= ?, LicenceNum= ? where CustomerID= ?";
		
	    PreparedStatement preparedStmt = connection.prepareStatement(Update);
		preparedStmt.setString(1, customer.getFirstName());
		preparedStmt.setString(2, customer.getLastName());
		preparedStmt.setString(3, customer.getTown());
		preparedStmt.setInt(4, customer.getLicenceNum());
		preparedStmt.setInt(5, customer.getCustomerID());
		preparedStmt.execute();
		preparedStmt.close();
		
		/*
		String Update = "update customer set FirstName= 'Mary', LastName= 'Smith',  where CustomerID= '1'";

		statement = connection.createStatement();
		System.out.println(statement);
		statement.execute(Update);
		System.out.println("Updated");
		*/
	}
	
	////////////////////////////////////////////////////////
	//CRUD(Create, Read, Update, Delete) methods for Vehicle
	////////////////////////////////////////////////////////
	
	@Override
	//Show all current vehicles
	public List<Vehicle> readVehicle() throws SQLException,RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Read vehicle");
		
		statement = connection.createStatement();
		
		List<Vehicle> List = new ArrayList<Vehicle>();
		String Select = "select * from vehicle";
		
		ResultSet rs = statement.executeQuery(Select);
		
		while (rs.next()) { 
			int CarID = rs.getInt("CarID");
			String RegNumber = rs.getString("RegNumber");
			String Model = rs.getString("Model");
			int Year = rs.getInt("Year");
			int DepotCode = rs.getInt("DepotCode");
			
			Vehicle s = new Vehicle(CarID,RegNumber,Model,Year,DepotCode);
					
			List.add(s);
		}
		return List;
	}
	
	@Override
	public void createVehicle(Vehicle vehicle)throws RemoteException, SQLException{
		
		String Create = "insert into vehicle (CarID, RegNumber, Model, Year, DepotCode)" + "values (?,?,?,?,?)";
		
		PreparedStatement preparedStmt = connection.prepareStatement(Create);
		preparedStmt.setInt (1, vehicle.getCarID());
		preparedStmt.setString (2, vehicle.getRegNumber());
		preparedStmt.setString (3, vehicle.getModel());
		preparedStmt.setInt(4, vehicle.getYear());
		preparedStmt.setInt(5, vehicle.getDepotCode());

		preparedStmt.execute();
		preparedStmt.close();
		
		/*
		String Create = "insert into vehicle (CarID, RegNumber, Model, Year, DepotCode) values ('4','T6789','Audi','2007','986')";
				
		statement = connection.createStatement();
		System.out.println(statement);
		statement.execute(Create);
		System.out.println("Created");
		*/
	}
	
	@Override
	public void deleteVehicle(Vehicle vehicle) throws RemoteException, SQLException{
		
		String Delete = "delete from vehicle where CarID= ?";
		
		PreparedStatement preparedStmt = connection.prepareStatement(Delete);
		preparedStmt.setInt(1, vehicle.getCarID());
		preparedStmt.execute();
		
		/*
		String Delete = "delete from vehicle where CarID='2'";
		
		statement = connection.createStatement();
		System.out.println(statement);
		statement.execute(Delete);
		System.out.println("Deleted");
		*/
	}
	
	@Override
	public void updateVehicle(Vehicle vehicle) throws RemoteException, SQLException{
		
		String Update = "update vehicle set RegNumber= ?, Model= ?, Year= ?, DepotCode= ? where CarID= ?";
		
	    PreparedStatement preparedStmt = connection.prepareStatement(Update);
		preparedStmt.setString(1, vehicle.getRegNumber());
		preparedStmt.setString(2, vehicle.getModel());
		preparedStmt.setInt(3, vehicle.getYear());
		preparedStmt.setInt(4, vehicle.getDepotCode());
		preparedStmt.setInt(5, vehicle.getCarID());
		preparedStmt.execute();
		preparedStmt.close();
		
		/*
		String Update = "update vehicle set RegNumber= 'D2345', Model= 'BMW'  where CarID= '1'";
		 
		statement = connection.createStatement();
		System.out.println(statement);
		statement.execute(Update);
		System.out.println("Updated");
		*/
	}
}
