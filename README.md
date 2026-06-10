<!DOCTYPE html>
<html>
<head>
    <title>Bank Management System</title>
</head>
<body>

    <h1>🏦 Bank Management System</h1>

    <h2>📌 Description</h2>
    <p>A simple Spring Boot REST API project to manage bank customers using MySQL and JPA.</p>

    <h2>⚙️ Technologies</h2>
    <ul>
        <li>Java</li>
        <li>Spring Boot</li>
        <li>Spring Data JPA</li>
        <li>MySQL</li>
        <li>Postman</li>
    </ul>

    <h2>👤 Customer Fields</h2>
    <ul>
        <li>Customer ID</li>
        <li>Customer Name</li>
        <li>Account Number</li>
        <li>Balance</li>
        <li>Email</li>
        <li>Phone Number</li>
    </ul>

    <h2>🚀 API Endpoints</h2>

    <h3>➕ Add Customer</h3>
    <p>POST /customer/add</p>

    <h3>📋 Get All Customers</h3>
    <p>GET /customer/getAll</p>

    <h3>🔍 Get Customer by ID</h3>
    <p>GET /customer/getById?id={id}</p>

    <h3>🔎 Get Customer by Name</h3>
    <p>GET /customer/getByName?name={name}</p>

    <h3>✏️ Update Customer</h3>
    <p>PUT /customer/update/{id}</p>

    <h3>❌ Delete Customer</h3>
    <p>DELETE /customer/delete/{id}</p>

    <h2>🧪 Testing</h2>
    <p>Use Postman to test all APIs. Send JSON body for POST and PUT requests.</p>

    <h2>🗄️ Database</h2>
    <p>MySQL is used and tables are created automatically using JPA.</p>

</body>
</html>
