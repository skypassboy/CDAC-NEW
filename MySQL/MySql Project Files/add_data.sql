INSERT INTO Department (Department_ID, Department_Name)
VALUES
    (1, 'Engineering'),
    (2, 'Finance'),
    (3, 'Human Resources'),
    (4, 'Sales'),
    (5, 'Marketing'),
    (6, 'R and D'),
    (7, 'Customer Support'),
    (8, 'IT Services'),
    (9, 'Legal'),
    (10, 'Administration');

INSERT INTO Employee (Name, Mobile_Number, AadharCard_ID, Salary, Department_ID)
VALUES
    ('Shrinivas Jadhav', '9876543210', '1234-5678-9012', 150000, 1),
    ('Dhaneshree Rangole', '8765432109', '2345-6789-0123', 60000, 2),
    ('Amit Kumar', '7654321098', '3456-7890-1234', 45000, 1),
    ('Priya Singh', '6543210987', '4567-8901-2345', 55000, 3),
    ('Rajesh Patel', '5432109876', '5678-9012-3456', 70000, 2),
    ('Neha Sharma', '4321098765', '6789-0123-4567', 48000, 3),
    ('Vikram Singh', '3210987654', '7890-1234-5678', 52000, 1),
    ('Sonia Verma', '2109876543', '8901-2345-6789', 63000, 2),
    ('Rahul Gupta', '1098765432', '9012-3456-7890', 58000, 3),
    ('Anita Joshi', '9988776655', '1234-5678-9012', 67000, 1);

INSERT INTO Landlord (Name, Mobile_Number, Email, AadharCard_No)
VALUES
    ('Rajesh Kumar', '9876543210', 'rajesh@example.com', '1234-5678-9012'),
    ('Priya Sharma', '8765432109', 'priya@example.com', '2345-6789-0123'),
    ('Amit Singh', '7654321098', 'amit@example.com', '3456-7890-1234'),
    ('Sonia Verma', '6543210987', 'sonia@example.com', '4567-8901-2345'),
    ('Rahul Gupta', '5432109876', 'rahul@example.com', '5678-9012-3456'),
    ('Anita Joshi', '4321098765', 'anita@example.com', '6789-0123-4567'),
    ('Vikram Sharma', '3210987654', 'vikram@example.com', '7890-1234-5678'),
    ('Neha Patel', '2109876543', 'neha@example.com', '8901-2345-6789'),
    ('Ramesh Yadav', '1098765432', 'ramesh@example.com', '9012-3456-7890'),
    ('Pooja Gupta', '9988776655', 'pooja@example.com', '1234-5678-9012');




INSERT INTO Tenant (Name, Mobile_Number, Email, AadharCard_No)
VALUES
    ('Rahul Kumar', '9876543210', 'rahul@example.com', '1234-5678-9012'),
    ('Suman Verma', '8765432109', 'suman@example.com', '2345-6789-0123'),
    ('Anjali Singh', '7654321098', 'anjali@example.com', '3456-7890-1234'),
    ('Arjun Sharma', '6543210987', 'arjun@example.com', '4567-8901-2345'),
    ('Meena Yadav', '5432109876', 'meena@example.com', '5678-9012-3456'),
    ('Vijay Patel', '4321098765', 'vijay@example.com', '6789-0123-4567'),
    ('Priya Sharma', '3210987654', 'priya@example.com', '7890-1234-5678'),
    ('Rajat Yadav', '2109876543', 'rajat@example.com', '8901-2345-6789'),
    ('Neha Gupta', '1098765432', 'neha@example.com', '9012-3456-7890'),
    ('Pooja Joshi', '9988776655', 'pooja@example.com', '1234-5678-9012');



INSERT INTO Property (Landlord_ID, Location, Property_Area_Sqft, BHK, Rent, Deposit, Furnished)
VALUES
    (1, 'Mumbai', 1500, 2, 18000, 20000, 'Yes'),
    (2, 'Delhi', 1480, 1, 12000, 15000, 'No'),
    (3, 'Bangalore', 1520, 3, 22000, 25000, 'Yes'),
    (4, 'Chennai', 1475, 2, 17000, 22000, 'No'),
    (5, 'Kolkata', 1490, 1, 13000, 16000, 'Yes'),
    (6, 'Hyderabad', 1550, 4, 25000, 30000, 'Yes'),
    (7, 'Pune', 1530, 3, 20000, 27000, 'No'),
    (8, 'Ahmedabad', 1485, 2, 16000, 19000, 'Yes'),
    (9, 'Jaipur', 1495, 1, 10000, 12000, 'No'),
    (10, 'Lucknow', 1478, 2, 16000, 20000, 'Yes');


INSERT INTO RentAgreement (Property_ID, Tenant_ID, MonthsOfLease, Rent_Amount)
VALUES
    (1, 1, 12, (SELECT Rent FROM Property WHERE Property_ID = 1)),
    (2, 2, 6, (SELECT Rent FROM Property WHERE Property_ID = 2)),
    (3, 3, 24, (SELECT Rent FROM Property WHERE Property_ID = 3)),
    (4, 4, 18, (SELECT Rent FROM Property WHERE Property_ID = 4)),
    (5, 5, 9, (SELECT Rent FROM Property WHERE Property_ID = 5)),
    (6, 6, 36, (SELECT Rent FROM Property WHERE Property_ID = 6)),
    (7, 7, 30, (SELECT Rent FROM Property WHERE Property_ID = 7)),
    (8, 8, 15, (SELECT Rent FROM Property WHERE Property_ID = 8)),
    (9, 9, 12, (SELECT Rent FROM Property WHERE Property_ID = 9)),
    (10, 10, 18, (SELECT Rent FROM Property WHERE Property_ID = 10));

