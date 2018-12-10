
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
 *         &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DepotCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "carID",
    "regNumber",
    "model",
    "year",
    "depotCode"
})
@XmlRootElement(name = "Vehicle")
public class Vehicle implements Serializable{

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "CarID")
    protected int carID;
    @XmlElement(name = "RegNumber", required = true)
    protected String regNumber;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "DepotCode")
    protected int depotCode;
    
	public Vehicle() {
		super();
	}

	//Constructor for Vehicle
	public Vehicle(int carID, String regNumber, String model, int year, int depotCode) {
		// TODO Auto-generated constructor stub
		super();
		this.carID = carID;
		this.regNumber = regNumber;
		this.model = model;
		this.year = year;
		this.depotCode = depotCode;
	}

	//Gets the value of the carID property
    public int getCarID() {
        return carID;
    }

    //Sets the value of the carID property
    public void setCarID(int value) {
        this.carID = value;
    }

    //Gets the value of the regNumber property
    public String getRegNumber() {
        return regNumber;
    }

    //Sets the value of the regNumber property
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    //Gets the value of the model property
    public String getModel() {
        return model;
    }

    //Sets the value of the model property
    public void setModel(String value) {
        this.model = value;
    }

    //Gets the value of the year property
    public int getYear() {
        return year;
    }

    //Sets the value of the year property
    public void setYear(int value) {
        this.year = value;
    }

    //Gets the value of the depotCode property
    public int getDepotCode() {
        return depotCode;
    }

    //Sets the value of the depotCode property
    public void setDepotCode(int value) {
        this.depotCode = value;
    }

}
