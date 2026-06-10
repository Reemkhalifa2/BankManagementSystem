```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Management System - README</title>
    <style>
        body {
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif;
            line-height: 1.6;
            color: #333;
            max-width: 900px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f9f9f9;
        }
        h1, h2, h3 {
            color: #1a365d;
            border-bottom: 2px solid #e2e8f0;
            padding-bottom: 8px;
        }
        h1 { border-bottom: 3px solid #2b6cb0; }
        code {
            font-family: "Courier New", Courier, monospace;
            background-color: #edf2f7;
            padding: 2px 6px;
            border-radius: 4px;
            font-size: 0.9em;
        }
        pre {
            background-color: #1a202c;
            color: #fff;
            padding: 15px;
            border-radius: 6px;
            overflow-x: auto;
        }
        pre code {
            background-color: transparent;
            color: inherit;
            padding: 0;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            background: #fff;
        }
        th, td {
            border: 1px solid #cbd5e0;
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #ebf8ff;
            color: #2b6cb0;
        }
        tr:nth-child(even) {
            background-color: #f7fafc;
        }
        .method {
            font-weight: bold;
            padding: 4px 8px;
            border-radius: 4px;
            font-size: 0.85em;
            display: inline-block;
        }
        .post { background-color: #def7ec; color: #03543f; }
        .get { background-color: #e1effe; color: #1e429f; }
        .put { background-color: #fef08a; color: #713f12; }
        .delete { background-color: #fde8e8; color: #9b1c1c; }
    </style>
</head>
<body>

    <h1>🏦 Bank Management System</h1>
    <p>A simple, production-ready <strong>Spring Boot REST API</strong> project to manage bank customers using <strong>MySQL</strong> and <strong>Spring Data JPA</strong>.</p>

    <h2>⚙️ Technologies</h2>
    <ul>
        <li><strong>Java 17+</strong></li>
        <li><strong>Spring Boot 3.x</strong></li>
        <li><strong>Spring Data JPA</strong> (Hibernate)</li>
        <li><strong>MySQL</strong> Database</li>
        <li><strong>Postman</strong> (For API testing)</li>
    </ul>

    <h2>👤 Customer Fields</h2>
    <table>
        <thead>
            <tr>
                <th>Field Name</th>
                <th>Type</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><code>id</code></td>
                <td>Long</td>
                <td>Primary Key (Auto-Increment)</td>
            </tr>
            <tr>
                <td><code>name</code></td>
                <td>String</td>
                <td>Customer Full Name</td>
            </tr>
            <tr>
                <td><code>accountNumber</code></td>
                <td>String</td>
                <td>Unique Bank Account Number</td>
            </tr>
            <tr>
                <td><code>balance</code></td>
                <td>Double</td>
                <td>Current Account Balance</td>
            </tr>
            <tr>
                <td><code>email</code></td>
                <td>String</td>
                <td>Unique Email Address</td>
            </tr>
            <tr>
                <td><code>phoneNumber</code></td>
                <td>String</td>
                <td>Unique Contact Number</td>
            </tr>
        </tbody>
    </table>

    <h2>🚀 API Endpoints</h2>
    <p><strong>Base URL:</strong> <code>http://localhost:8080/customer</code></p>
    
    <table>
        <thead>
            <tr>
                <th>Method</th>
                <th>Endpoint</th>
                <th>Description</th>
                <th>Parameters / Body</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><span class="method post">POST</span></td>
                <td><code>/add</code></td>
                <td>Add a new customer</td>
                <td>JSON Request Body</td>
            </tr>
            <tr>
                <td><span class="method get">GET</span></td>
                <td><code>/getAll</code></td>
                <td>Get all registered customers</td>
                <td>None</td>
            </tr>
            <tr>
                <td><span class="method get">GET</span></td>
                <td><code>/getById</code></td>
                <td>Find customer by ID</td>
                <td>Query Param: <code>?id={id}</code></td>
            </tr>
            <tr>
                <td><span class="method get">GET</span></td>
                <td><code>/getByName</code></td>
                <td>Find customer by name</td>
                <td>Query Param: <code>?name={name}</code></td>
            </tr>
            <tr>
                <td><span class="method put">PUT</span></td>
                <td><code>/update/{id}</code></td>
                <td>Update existing customer details</td>
                <td>Path Variable <code>{id}</code> + JSON Body</td>
            </tr>
            <tr>
                <td><span class="method delete">DELETE</span></td>
                <td><code>/delete/{id}</code></td>
                <td>Delete a customer record</td>
                <td>Path Variable <code>{id}</code></td>
            </tr>
        </tbody>
    </table>

    <h3>💡 Sample JSON Payload (POST / PUT)</h3>
<pre><code>{
  "name": "Jane Doe",
  "accountNumber": "ACT123456789",
  "balance": 2500.50,
  "email": "jane.doe@example.com",
  "phoneNumber": "+1234567890"
}</code></pre>

    <h2>🔧 Database Configuration</h2>
    <p>Configure your <code>src/main/resources/application.properties</code> before running the app:</p>
<pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/bank_system?useSSL=false
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true</code></pre>

</body>
</html>

```
