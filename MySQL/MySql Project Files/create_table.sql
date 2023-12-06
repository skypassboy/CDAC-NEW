CREATE TABLE Department (
    Department_ID INT PRIMARY KEY,
    Department_Name VARCHAR(20) UNIQUE NOT NULL
);

CREATE TABLE Employee (
    Employee_ID INT PRIMARY KEY auto_increment,
    Name VARCHAR(30),
    Mobile_Number VARCHAR(10),
    AadharCard_ID VARCHAR(20),
    Salary INT,
    Department_ID INT,
    FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID)
);

CREATE TABLE Landlord (
    Landlord_ID INT PRIMARY KEY auto_increment,
    Name VARCHAR(30) NOT NULL,
    Mobile_Number VARCHAR(10) NOT NULL,
    Email VARCHAR(30),
    AadharCard_No VARCHAR(20)
);

CREATE TABLE Tenant (
    Tenant_ID INT PRIMARY KEY auto_increment,
    Name VARCHAR(30),
    Mobile_Number VARCHAR(10),
    Email VARCHAR(30),
    AadharCard_No VARCHAR(20)
);

CREATE TABLE Property (
    Property_ID INT PRIMARY KEY auto_increment,
    Landlord_ID INT,
    Location VARCHAR(30) NOT NULL,
    Property_Area_Sqft INT,
    BHK INT NOT NULL,
    Rent INT NOT NULL,
    Deposit INT,
    Furnished VARCHAR(3) NOT NULL,
    FOREIGN KEY (Landlord_ID) REFERENCES Landlord(Landlord_ID)
);

CREATE TABLE RentAgreement (
    RentAgreement_ID INT PRIMARY KEY auto_increment,
    Property_ID INT,
    Tenant_ID INT,
    MonthsOfLease INT,
    Rent_Amount INT,
    FOREIGN KEY (Property_ID) REFERENCES Property(Property_ID),
    FOREIGN KEY (Tenant_ID) REFERENCES Tenant(Tenant_ID)
);