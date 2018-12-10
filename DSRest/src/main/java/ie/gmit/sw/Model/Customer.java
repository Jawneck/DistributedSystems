package ie.gmit.sw.Model;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Town" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LicenceNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "customerID",
    "firstName",
    "lastName",
    "town",
    "licenceNum"
})
@XmlRootElement(name = "Customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "CustomerID")
    protected int customerID;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "Town", required = true)
    protected String town;
    @XmlElement(name = "LicenceNum")
    protected int licenceNum;
    
	public Customer() {
		super();
	}

	//Constructor for Customer
	public Customer(int customerID, String firstName, String lastName, String town, int licenceNum) {
		// TODO Auto-generated constructor stub
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.town = town;
		this.licenceNum = licenceNum;
	}

	//Gets the value of the customerID property
    public int getCustomerID() {
        return customerID;
    }

    //Sets the value of the customerID property
    public void setCustomerID(int value) {
        this.customerID = value;
    }

    //Gets the value of the firstName property
    public String getFirstName() {
        return firstName;
    }

    //Sets the value of the firstName property
    public void setFirstName(String value) {
        this.firstName = value;
    }

    //Gets the value of the lastName property
    public String getLastName() {
        return lastName;
    }

    //Sets the value of the lastName property
    public void setLastName(String value) {
        this.lastName = value;
    }

    //Gets the value of the town property
    public String getTown() {
        return town;
    }

    //Sets the value of the town property
    public void setTown(String value) {
        this.town = value;
    }

    //Gets the value of the licenceNum property
    public int getLicenceNum() {
        return licenceNum;
    }

    //Gets the value of the licenceNum property
    public void setLicenceNum(int value) {
        this.licenceNum = value;
    }
}
