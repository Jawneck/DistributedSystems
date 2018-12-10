<p align="center">
  <b>A RESTful Car Hire Booking System using JAX-RS/Jersey, Java RMI and JAXB frameworks.
</b><br>
</p>

# Description
The task was to create a Car Hire Booking System which allows the user to Create/Read/Update and Delete bookings in a database. The client interacts with a RESTful JAX-RS Web Service which is deployed on a Apache Tomcat Server. The RESTful Web Service also acts as an RMI client to the RMI Database Server which will handle persistence.

The point of this project was to get some hands on programming experience with technologies such as RESTful Web Services, Remote Method Invocation, Inter-Process Communication and Data Externalisation.

There are 4 parts to this project.

- Simple Web Client
- RESTFul Web Service(JAX-RS/Jersey)
- Data Modelling
- RMI Database Server

# Running the Programme
Create the database like so
```
 mysql -u root -p -s < <the path of the mysql script>>
```
Or input the following into mysql
```
CREATE DATABASE carhirebooking;
use carhirebooking;

CREATE TABLE IF NOT EXISTS Booking(
	BookingID int NOT NULL AUTO_INCREMENT,
	CustomerID int Not Null,
	CarID int Not Null,
	PickupDate DATE Not Null,
	DropoffDate Date Not Null,
	PRIMARY KEY(BookingID)
);

INSERT INTO Booking (BookingID, CustomerID, CarID, PickupDate, DropoffDate)
VALUES (1,1,1,'2018-12-04','2018-12-10'),
	   (2,2,2,'2018-12-04','2018-12-10'),
	   (3,3,2,'2018-12-04','2018-12-10');
	   	   
CREATE TABLE IF NOT EXISTS Customer(
	CustomerID int NOT NULL AUTO_INCREMENT,
	FirstName VARCHAR(255) Not Null,
	LastName VARCHAR(255) Not Null,
	Town VARCHAR(255) Not Null,
	LicenceNum int Not Null,
	PRIMARY KEY(CustomerID)
); 

INSERT INTO Customer(CustomerID, FirstName, LastName, Town, LicenceNum)
VALUES (1,'John','McDonagh','Galway',123456789),
	   (2,'Martin','Doonan','Athlone',987654321),
	   (3,'Bobby','Hand','Navan',123498765);
	   
	   
CREATE TABLE IF NOT EXISTS Vehicle(
	CarID int NOT NULL AUTO_INCREMENT,
	RegNumber VARCHAR(255) Not Null,
	Model VARCHAR(255) Not Null,
	Year int Not Null,
	DepotCode int Not Null,
	PRIMARY KEY(CarID)
); 

INSERT INTO Vehicle(CarID, RegNumber, Model, Year, DepotCode)
VALUES (1,'W1234','Toyota',1999,102),
	   (2,'D8765','Honda',2005,040),
	   (3,'J5621','Mitsubishi',1999,024);   
```
Import the project into Eclipse Java Enterprise Edition<br>
Once you have successfully imported the project<br>
Right click on RMI > Run as > Java Application (a window may appear, if so select SetupService)<br>
Right click on DSRest > Run as > Run on server<br>

From here you can click to view the tables in the database.<br>
I initially did the CRUD methods and tested them by hard coding in the SQL statements to see if they were working.<br>
After that I used prepared statements to give more re-usability to the methods<br>
I tested the prepared statements using Postman to make sure that they are working<br>
However, I never got around to making a web client as it took longer than expected to get everything else working and I ran out of time.<br>
For whatever reason the ports 8005, 8080, 8009 were aready in use on my machine and I couldnt figure out why so I had them set to 8006, 8081, 8010 when I was testing the programme.<br>
I have set them back to 8005, 8080, 8009 as I presume that it should work for you like that on your machine.<br>
Please email me if you have issues with this.

Danielis Joniskis, G00333859
