package ie.gmit.sw.Model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ie.gmit.sw.Model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


	//Create a new ObjectFactory that can be used to create new instances of schema derived classes for package
    public ObjectFactory() {
    }

    //Creates an instance of Booking
    public Booking createBooking() {
        return new Booking();
    }

    //Creates an instance of Customer
    public Customer createCustomer() {
        return new Customer();
    }

    //Creates an instance of Vehicle
    public Vehicle createVehicle() {
        return new Vehicle();
    }
}
