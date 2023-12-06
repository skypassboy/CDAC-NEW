-- Procedures***************************************************************************************************************************
1) Procedure to add property by landlord

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

call AddProperty(8,"mysore",1250,3,20000,40000,"yes");


2) Procedure to add tenant details by tenant


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


call AddTenant("Digamber Sawant","8975648759","digamber@example.com","9875-4587-6985");

--functions *****************************************************************************************************************


1)Function to get property COUNT by tenant

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


select GetPropertyCount();

2) function to get Get Total Rent of Landlord by landlord

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

-- views*****************************************************************************************************************************

CREATE VIEW LandlordPropertyView AS
SELECT
    l.Name,
    l.Mobile_Number,
    l.Email,
    p.Location,
    p.Property_Area_Sqft,
    p.BHK,
    p.Rent,
    p.Deposit,
    p.Furnished
FROM
    landlord l
JOIN
    property p ON l.Landlord_ID = p.Landlord_ID;


select * from LandlordPropertyView;


-- triggers*******************************************************************************************************************************

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


UPDATE Property
SET Rent = 17000
WHERE Property_ID = 1;


