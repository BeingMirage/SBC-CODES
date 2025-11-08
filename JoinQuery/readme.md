# 🔗 JDBC + MySQL: JOIN Query Example

This project demonstrates how to perform a **SQL JOIN query** in MySQL using **Java JDBC** to combine data from multiple tables and display it in the console.

---

## ⚙️ 1️⃣ Create the Database and Tables

### Step 1: Open MySQL
Use **MySQL Command Line** or **MySQL Workbench** and log in:
```bash
mysql -u root -p
```

### CREATE DATABASE
```
CREATE DATABASE college;
USE college;

-- Create course table
CREATE TABLE course (
  cid INT PRIMARY KEY AUTO_INCREMENT,
  cname VARCHAR(50)
);

-- Create student table with foreign key
CREATE TABLE student (
  sid INT PRIMARY KEY AUTO_INCREMENT,
  sname VARCHAR(50),
  cid INT,
  FOREIGN KEY (cid) REFERENCES course(cid)
);

-- Insert sample data
INSERT INTO course (cname) VALUES ('CSE'), ('IT'), ('ENTC');
INSERT INTO student (sname, cid) VALUES ('Amit', 1), ('Riya', 2), ('Sahil', 3);


```

### Folder Structure
JoinQuery/
│
├── JoinDemo.java
├── mysql-connector-j-9.5.0.jar


### Compile and Run
```
javac -cp .;mysql-connector-j-9.5.0.jar JoinDemo.java
java  -cp .;mysql-connector-j-9.5.0.jar JoinDemo
```

### Expected Output

```
Student ID | Name | Course
---------------------------
1 | Amit | CSE
2 | Riya | IT
3 | Sahil | ENTC
```