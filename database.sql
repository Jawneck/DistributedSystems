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
	   	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   