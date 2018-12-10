package ie.gmit.sw.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.sql.SQLException;

public class ServiceSetup {
	public static void main(String[] args) throws RemoteException, MalformedURLException, SQLException {
	
		//Creating an instance of DatabaseServiceImpl
		DatabaseService ds = new DatabaseServiceImpl();
		
		//Creating the registry
		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("database", ds);
		
		System.out.println("Server ready");
		
	}
}
