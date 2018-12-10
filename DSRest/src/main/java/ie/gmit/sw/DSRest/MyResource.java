package ie.gmit.sw.DSRest;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.gmit.sw.Model.Booking;
import ie.gmit.sw.Model.Customer;
import ie.gmit.sw.Model.Vehicle;
import ie.gmit.sw.rmi.DatabaseService;

@Path("myresource")
public class MyResource {
	
	///////////////////////////////////////////////////
	//HTTP Methods (GET, POST, DELETE, PUT) for Booking
	///////////////////////////////////////////////////
	
	//Showing all current bookings
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("readBooking")
	public List<Booking> getBooking() throws MalformedURLException, RemoteException, Exception{
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		return ds.readBooking();
	}
	
	//Creates a new booking the database
	@POST
	@Path("createBooking")
	public void createOrder(Booking booking) throws MalformedURLException, RemoteException, NotBoundException, SQLException {
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		ds.createBooking(booking);	
	}
	
	//Deletes a booking from the database
	@DELETE
	@Path("deleteBooking")
	public void deleteOrder(Booking booking) throws MalformedURLException, RemoteException, NotBoundException, SQLException {
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		ds.deleteBooking(booking);	
	}
	
	//Updates a booking in the database
	@PUT
	@Path("updateBooking")
	public void updateOrder(Booking booking) throws RemoteException, SQLException, MalformedURLException, NotBoundException {
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		ds.updateBooking(booking);	
	}
	
	///////////////////////////////////////////////////
	//HTTP Methods (GET, POST, DELETE, PUT) for Customer
	///////////////////////////////////////////////////
	
	//Showing all current customers
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("readCustomer")
	public List<Customer> getCustomer() throws MalformedURLException, RemoteException, Exception{
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		return ds.readCustomer();
	}
	
	//Creates a customer in the database
	@POST
	@Path("createCustomer")
	public void createCustomer(Customer customer) throws MalformedURLException, RemoteException, NotBoundException, SQLException {
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		ds.createCustomer(customer);	
	}
	
	//Deletes a customer from the database
	@DELETE
	@Path("deleteCustomer")
	public void deleteCustomer(Customer customer) throws MalformedURLException, RemoteException, NotBoundException, SQLException {
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		ds.deleteCustomer(customer);	
	}
	
	//Updates a customer in the database
	@PUT
	@Path("updateCustomer")
	public void updateCustomer(Customer customer) throws RemoteException, SQLException, MalformedURLException, NotBoundException {
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		ds.updateCustomer(customer);	
	}
	
	///////////////////////////////////////////////////
	//HTTP Methods (GET, POST, DELETE, PUT) for Vehicle
	///////////////////////////////////////////////////
	
	//Showing all current Vehicles
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("readVehicle")
	public List<Vehicle> getVehicle() throws MalformedURLException, RemoteException, Exception{
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		return ds.readVehicle();
	}
	
	//Creates a vehicle in the database
	@POST
	@Path("createVehicle")
	public void createVehicle(Vehicle vehicle) throws MalformedURLException, RemoteException, NotBoundException, SQLException {
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		ds.createVehicle(vehicle);	
	}
	
	//Deletes a vehicle from the database
	@DELETE
	@Path("deleteVehicle")
	public void deleteVehicle(Vehicle vehicle) throws MalformedURLException, RemoteException, NotBoundException, SQLException {
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		ds.deleteVehicle(vehicle);	
	}
	
	//Updates a vehicle in the database
	@PUT
	@Path("updateVehicle")
	public void updateVehicle(Vehicle vehicle) throws RemoteException, SQLException, MalformedURLException, NotBoundException {
		
		DatabaseService ds;
		ds = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
		
		ds.updateVehicle(vehicle);	
	}

}