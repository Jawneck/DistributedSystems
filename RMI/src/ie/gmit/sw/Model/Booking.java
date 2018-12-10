package ie.gmit.sw.Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DropoffDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingID",
    "customerID",
    "carID",
    "pickupDate",
    "dropoffDate",
    "customer",
    "vehicle"
})
@XmlRootElement(name = "Booking")
public class Booking implements Serializable{

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "BookingID")
    protected int bookingID;
    @XmlElement(name = "CustomerID")
    protected int customerID;
    @XmlElement(name = "CarID")
    protected int carID;
    @XmlElement(name = "PickupDate", required = true)
    @XmlSchemaType(name = "date")
    protected Date pickupDate;
    @XmlElement(name = "DropoffDate", required = true)
    @XmlSchemaType(name = "date")
    protected Date dropoffDate;
    @XmlElement(name = "Customer", required = true)
    protected Customer customer;
    @XmlElement(name = "Vehicle", required = true)
    protected Vehicle vehicle;
    
	public Booking() {
		super();
	}

	//Constructor for Booking
	public Booking(int bookingID, int customerID, int carID, Date pickupDate, Date dropoffDate) {
		// TODO Auto-generated constructor stub
		super();
		this.bookingID = bookingID;
		this.customerID = customerID;
		this.carID = carID;
		this.pickupDate = pickupDate;
		this.dropoffDate = dropoffDate;
	}
      
    //Gets the value of the bookingID property
    public int getBookingID() {
        return bookingID;
    }
    
    //Sets the value of the bookingID property
    public void setBookingID(int value) {
        this.bookingID = value;
    }
  
    //Gets the value of the customerID property
    public int getCustomerID() {
        return customerID;
    }
   
    //Sets the value of the customerID property
    public void setCustomerID(int value) {
        this.customerID = value;
    }
  
    //Gets the value of the carID property
    public int getCarID() {
        return carID;
    }
    
    //Sets the value of the carID property
    public void setCarID(int value) {
        this.carID = value;
    }
  
    //Gets the value of the pickupDate property
    public Date getPickupDate() {
        return pickupDate;
    }
    
    //Sets the value of the pickupDate property
    public void setPickupDate(Date value) {
        this.pickupDate = value;
    }
    
    //Gets the value of the dropoffDate property
    public Date getDropoffDate() {
        return dropoffDate;
    }

   	//Sets the value of the dropoffDate property
    public void setDropoffDate(Date value) {
        this.dropoffDate = value;
    }
    
    //Gets the value of the customer property
    public Customer getCustomer() {
        return customer;
    }
    
    //Sets the value of the customer property
    public void setCustomer(Customer value) {
        this.customer = value;
    }
    
    //Gets the value of the vehicle property
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    //Sets the value of the vehicle property
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }
}
