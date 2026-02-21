GROCERY STORE MANAGEMENT SYSTEM

Team Members

Anaha Shaji

Ashika J

----------------------------------------------------------------------------------------------------------------------------------------------
Project Title

Grocery Store Management System (Mini Project)
----------------------------------------------------------------------------------------------------------------------------------------------
Problem Statement

Small grocery stores often manage inventory manually, which can lead to data errors, stock mismanagement, and difficulty tracking items.
This project provides a simple desktop-based inventory management system to store, view, and delete grocery item details using a database.

----------------------------------------------------------------------------------------------------------------------------------------------
Objective

To develop a Java-based desktop application that:
Allows users to add grocery items to a database
View stored items in a table format
Delete items from the database
Connect Java application with MySQL database

----------------------------------------------------------------------------------------------------------------------------------------------
Features Implemented

✔ Add new grocery item

✔ View all stored items

✔ Delete item by ID

✔ GUI built using Java Swing

✔ Database connectivity using JDBC

✔ MySQL backend integration

----------------------------------------------------------------------------------------------------------------------------------------------
 Technologies Used

Java (Swing for GUI)

JDBC (Java Database Connectivity)

MySQL Database

NetBeans IDE

Maven (Build tool)

Git & GitHub

----------------------------------------------------------------------------------------------------------------------------------------------
Database Structure

Database Name: grocery
Table Name: items

Column Name	Data Type

id	INT (Primary Key)
name	VARCHAR
category	VARCHAR
price	DOUBLE
quantity	INT

▶ How to Run the Project

1. Install MySQL Server.

2. Create database:
CREATE DATABASE grocery;

3. Create table:
CREATE TABLE items (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    category VARCHAR(100),
    price DOUBLE,
    quantity INT
);

4. Open project in NetBeans.

5. Update MySQL username and password inside:
GroceryForm.java
ViewItems.java

6. Run the project.
----------------------------------------------------------------------------------------------------------------------------------------------
Screenshots

🏠 Home Page

<img width="200" height="200" alt="MainPage" src="https://github.com/user-attachments/assets/9683f726-d39b-4dae-a0b4-f3cb220de742" />

📋 View Items Page

<img width="200" height="200" alt="ViewItemsPage" src="https://github.com/user-attachments/assets/3b4dcdff-2b96-43ef-af71-9a0f5df22cf3" />

➕ Add Item

❌ Delete Item

<img width="200" height="200" alt="DeleteItemPage" src="https://github.com/user-attachments/assets/da43721e-e570-4ca1-8ae9-722ed217ca9d" />
<img width="200" height="200" alt="AfterDeleting" src="https://github.com/user-attachments/assets/b553e8c4-5eaa-4e50-8605-71315c5a7940" />

Screenshots of the applications are avalable in the **screenshot folder**

----------------------------------------------------------------------------------------------------------------------------------------------
Sample Test Case

Input:

ID: 101
Name: Rice
Category: Food
Price: 50
Quantity: 10

Output:
Item added successfully
Displayed in View Items table
Can be deleted using ID

Future Enhancements

Update item feature

Billing system

Search functionality

Stock alert system

User authentication

----------------------------------------------------------------------------------------------------------------------------------------------










