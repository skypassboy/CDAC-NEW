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



INSERT INTO Department (Department_ID, Department_Name)
VALUES
    (1, 'Finance'),
    (2, 'Human Resources'),
    (3, 'Marketing'),
    (4, 'IT'),
    (5, 'Operations'),
    (6, 'Sales'),
    (7, 'R and D'),
    (8, 'Customer Service'),
    (9, 'Legal'),
    (10, 'Administration');


INSERT INTO Employee (Employee_ID, Name, Mobile_Number, AadharCard_ID, Salary, Department_ID)
VALUES
    (1, 'John Doe', '1234567890', 'A123456789', 60000, 4),
    (2, 'Jane Smith', '9876543210', 'B987654321', 75000, 3),
    (3, 'Bob Johnson', '5551112222', 'C555111222', 50000, 6),
    (4, 'Alice Brown', '9998887777', 'D999888777', 80000, 2),
    (5, 'Charlie Davis', '1112223333', 'E111222333', 70000, 1),
    (6, 'Eva White', '4445556666', 'F444555666', 65000, 5),
    (7, 'Samuel Black', '7778889999', 'G777888999', 55000, 7),
    (8, 'Olivia Green', '2223334444', 'H222333444', 90000, 8),
    (9, 'William Jones', '6667778888', 'I666777888', 48000, 9),
    (10, 'Sophia Taylor', '3334445555', 'J333444555', 72000, 10);

INSERT INTO Landlord (Landlord_ID, Name, Mobile_Number, Email, AadharCard_No)
VALUES
    (1, 'Landlord1', '1111111111', 'landlord1@example.com', 'L111111111'),
    (2, 'Landlord2', '2222222222', 'landlord2@example.com', 'L222222222'),
    (3, 'Landlord3', '3333333333', 'landlord3@example.com', 'L333333333'),
    (4, 'Landlord4', '4444444444', 'landlord4@example.com', 'L444444444'),
    (5, 'Landlord5', '5555555555', 'landlord5@example.com', 'L555555555'),
    (6, 'Landlord6', '6666666666', 'landlord6@example.com', 'L666666666'),
    (7, 'Landlord7', '7777777777', 'landlord7@example.com', 'L777777777'),
    (8, 'Landlord8', '8888888888', 'landlord8@example.com', 'L888888888'),
    (9, 'Landlord9', '9999999999', 'landlord9@example.com', 'L999999999'),
    (10, 'Landlord10', '1010101010', 'landlord10@example.com', 'L101010101');


INSERT INTO Tenant (Tenant_ID, Name, Mobile_Number, Email, AadharCard_No)
VALUES
    (1, 'Tenant1', '1111111111', 'tenant1@example.com', 'T111111111'),
    (2, 'Tenant2', '2222222222', 'tenant2@example.com', 'T222222222'),
    (3, 'Tenant3', '3333333333', 'tenant3@example.com', 'T333333333'),
    (4, 'Tenant4', '4444444444', 'tenant4@example.com', 'T444444444'),
    (5, 'Tenant5', '5555555555', 'tenant5@example.com', 'T555555555'),
    (6, 'Tenant6', '6666666666', 'tenant6@example.com', 'T666666666'),
    (7, 'Tenant7', '7777777777', 'tenant7@example.com', 'T777777777'),
    (8, 'Tenant8', '8888888888', 'tenant8@example.com', 'T888888888'),
    (9, 'Tenant9', '9999999999', 'tenant9@example.com', 'T999999999'),
    (10, 'Tenant10', '1010101010', 'tenant10@example.com', 'T101010101');


INSERT INTO Property (Property_ID, Landlord_ID, Location, Property_Area_Sqft, BHK, Rent, Deposit, Furnished)
VALUES
    (1, 1, 'City1', 1200, 2, 15000, 20000, 'Yes'),
    (2, 2, 'City2', 1000, 1, 12000, 15000, 'No'),
    (3, 3, 'City3', 1500, 3, 20000, 25000, 'Yes'),
    (4, 4, 'City4', 1800, 2, 18000, 22000, 'No'),
    (5, 5, 'City5', 800, 1, 10000, 12000, 'Yes'),
    (6, 6, 'City6', 2000, 4, 25000, 30000, 'Yes'),
    (7, 7, 'City7', 1600, 3, 22000, 27000, 'No'),
    (8, 8, 'City8', 1400, 2, 17000, 20000, 'Yes'),
    (9, 9, 'City9', 1100, 1, 13000, 16000, 'No'),
    (10, 10, 'City10', 1300, 2, 16000, 19000, 'Yes');



INSERT INTO RentAgreement (RentAgreement_ID, Property_ID, Tenant_ID, MonthsOfLease, Rent_Amount)
VALUES
    (1, 1, 1, 12, 15000),
    (2, 2, 2, 6, 12000),
    (3, 3, 3, 24, 20000),
    (4, 4, 4, 18, 18000),
    (5, 5, 5, 9, 10000),
    (6, 6, 6, 36, 25000),
    (7, 7, 7, 30, 22000),
    (8, 8, 8, 15, 17000),
    (9, 9, 9, 12, 13000),
    (10, 10, 10, 18, 16000);

-- procedure*************************************************



1)

DELIMITER //

CREATE PROCEDURE AddProperty (
    IN p_Landlord_ID INT,
    IN p_Location VARCHAR(30),
    IN p_Property_Area_Sqft INT,
    IN p_BHK INT,
    IN p_Rent INT,
    IN p_Deposit INT,
    IN p_Furnished VARCHAR(3)
)
BEGIN
    INSERT INTO Property (
        Landlord_ID,
        Location,
        Property_Area_Sqft,
        BHK,
        Rent,
        Deposit,
        Furnished
    )
    VALUES (
        p_Landlord_ID,
        p_Location,
        p_Property_Area_Sqft,
        p_BHK,
        p_Rent,
        p_Deposit,
        p_Furnished
    );
END //

DELIMITER ;



2)

DELIMITER //
CREATE PROCEDURE AddTenant(
    IN in_name VARCHAR(30),
    IN in_mobile_number VARCHAR(10),
    IN in_email VARCHAR(30),
    IN in_aadhar_card_no VARCHAR(20)
)
BEGIN
    INSERT INTO Tenant (Name, Mobile_Number, Email, AadharCard_No)
    VALUES (in_name, in_mobile_number, in_email, in_aadhar_card_no);
END //
DELIMITER ;



-- trigger******************************************************************************************

DELIMITER //

CREATE TRIGGER update_rent_agreement
AFTER UPDATE ON Property
FOR EACH ROW
BEGIN
    UPDATE RentAgreement
    SET Rent_Amount = NEW.Rent
    WHERE Property_ID = NEW.Property_ID;
END;

//

DELIMITER ;


-- to drop trigger

DROP TRIGGER IF EXISTS update_rent_agreement;

--functions *****************************************************************************************************************


DELIMITER //

CREATE FUNCTION GetPropertyCount()
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE propertyCount INT;
    
    SELECT COUNT(*) INTO propertyCount
    FROM Property;

    RETURN propertyCount;
END;

//

DELIMITER ;





DELIMITER //

CREATE FUNCTION GetTotalRentByLandlord(LandlordID INT)
RETURNS INT
READS SQL DATA
BEGIN
    DECLARE TotalRent INT;
    
    SELECT SUM(ra.Rent_Amount)
    INTO TotalRent
    FROM rentagreement ra
    JOIN property p ON ra.Property_ID = p.Property_ID
    WHERE p.Landlord_ID = LandlordID;

    RETURN TotalRent;
END //

DELIMITER ;

select GetTotalRentByLandlord(6);

INSERT INTO RentAgreement (Property_ID, Tenant_ID, MonthsOfLease, Rent_Amount)
VALUES (13, 11, 12, 12000);


UPDATE property
SET Rent = 7000
WHERE Property_ID = 13;


INSERT INTO rentagreement (Property_ID, Tenant_ID, MonthsOfLease, Rent_Amount)
VALUES (12, 8, 11, 10000);



SELECT SUM(Rent_Amount) AS TotalRent
FROM rentagreement
WHERE Property_ID IN (SELECT Property_ID FROM property WHERE Landlord_ID = 8);
