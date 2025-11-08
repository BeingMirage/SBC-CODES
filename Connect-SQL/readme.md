# 🧠 JDBC + MySQL: Retrieve Students Example

A simple Java program that connects to a MySQL database using JDBC and retrieves student records from a table.

---

## ⚙️ 1️⃣ Create the MySQL Database and Table

### Step 1: Open MySQL
Open **MySQL Command Line** or **MySQL Workbench**, then log in:

```bash
mysql -u root -p

```

CREATE DATABASE college;
USE college;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    course VARCHAR(50),
    marks INT
);

INSERT INTO students (name, course, marks) VALUES
('Amit', 'CSE', 85),
('Riya', 'IT', 78),
('Sahil', 'ENTC', 92);

SELECT * FROM students;



## ⚙️2️⃣ How to run code :


### Directory Structure
Connect-SQL/
│
├── RetrieveStudents.java
├── mysql-connector-j-9.5.0.jar

### Step 1
```
javac -cp .;mysql-connector-j-9.5.0.jar RetrieveStudents.java
```

### Step 2
```
java -cp .;mysql-connector-j-9.5.0.jar RetrieveStudents
```
