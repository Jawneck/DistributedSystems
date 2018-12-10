package ie.gmit.sw.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import ie.gmit.sw.Model.Booking;
import ie.gmit.sw.Model.Customer;
import ie.gmit.sw.Model.Vehicle;

public interface DatabaseService extends Remote{

	//Declaring all booking methods
	public List<Booking> readBooking() throws RemoteException, SQLException;

	void createBooking(Booking booking) throws RemoteException, SQLException;
	
	void deleteBooking(Booking booking) throws RemoteException, SQLException;

	void updateBooking(Booking booking) throws RemoteException, SQLException;
	
	
	//Declaring all customer methods
	public List<Customer> readCustomer() throws RemoteException, SQLException;

	void createCustomer(Customer Customer) throws RemoteException, SQLException;
	
	void deleteCustomer(Customer Customer) throws RemoteException, SQLException;
	
	void updateCustomer(Customer customer) throws RemoteException, SQLException;

	
	//Declaring all vehicle methods
	public List<Vehicle> readVehicle() throws RemoteException, SQLException;

	void createVehicle(Vehicle vehicle) throws RemoteException, SQLException;
	
	void deleteVehicle(Vehicle vehicle) throws RemoteException, SQLException;
	
	void updateVehicle(Vehicle vehicle) throws RemoteException, SQLException;

	

	

	

}
