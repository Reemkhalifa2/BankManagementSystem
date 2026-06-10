🏦 Bank Management System
📌 Project Description

A simple REST API project built using Spring Boot, JPA, and MySQL to manage bank customers.

⚙️ Technologies
Java
Spring Boot
Spring Data JPA
MySQL
Postman
👤 Customer Fields
Customer ID
Name
Account Number
Balance
Email
Phone Number
🚀 API Endpoints
➕ Add Customer

POST /api/customers

📋 Get All Customers

GET /api/customers

🔍 Get Customer by ID

GET /api/customers/{id}

🔎 Get Customer by Name

GET /api/customers/name/{name}

✏️ Update Customer

PUT /api/customers/{id}

❌ Delete Customer

DELETE /api/customers/{id}

✅ Validation Rules
Name cannot be empty
Email must be valid
Balance cannot be negative
Account number must be unique
⚠️ Exceptions
Customer not found
Duplicate account number
