# Student Management System

A console-based **Student Management System** built using **Spring Framework** and **Spring JDBC** to demonstrate core Spring concepts such as Dependency Injection, IoC Container, Java-based Configuration, Bean Management, and database interaction with MySQL.

This project was developed as a learning project to gain hands-on experience with the Spring Framework before moving to Spring Boot.

---

## Features

* Add a new student
* View all students
* Search student by ID
* Update student details
* Delete a student
* Store data in MySQL database
* Send notifications using multiple Spring bean implementations

---

## Technologies Used

* Java 26
* Spring Framework 6
* Spring JDBC
* Maven
* MySQL
* IntelliJ IDEA

---

## Spring Framework Concepts Practiced

### Core Spring

* Inversion of Control (IoC)
* Dependency Injection (Constructor Injection)
* Bean Creation using `@Bean`
* Java-based Configuration using `@Configuration`
* Component Scanning using `@ComponentScan`
* Property Injection using `@Value`
* External Configuration using `@PropertySource`
* Bean Selection using `@Primary`
* Bean Selection using `@Qualifier`
* Stereotype Annotations

    * `@Component`
    * `@Service`
    * `@Repository`

### Spring JDBC

* `JdbcTemplate`
* `DriverManagerDataSource`
* `RowMapper`
* CRUD Operations
* SQL Parameter Binding

### Design Principles

* Layered Architecture
* Repository Pattern
* Service Layer
* Interface-based Programming
* Constructor Injection
* Separation of Concerns

---

## Project Structure

```text
student-management-system
├── database
│   └── student-management.sql
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org.maninder
│   │   │       ├── config
│   │   │       ├── mapper
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── App.java
│   │   └── resources
│   │       ├── application.properties.example
│   │       └── application.properties (local only)
│   └── test
├── pom.xml
├── README.md
└── .gitignore
```

---

## Database

The project uses **MySQL**.

The SQL script for creating the database and tables is available in:

```text
database/student-management.sql
```

---

## Application Flow

```text
App
   │
   ▼
StudentService
   │
   ▼
StudentRepository
   │
   ▼
JdbcTemplate
   │
   ▼
MySQL Database
```

---

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/maninder-kaur-21/student-management-system.git
```

### 2. Create the database

Execute the SQL script located in:

```text
database/student-management.sql
```

### 3. Configure database credentials

Copy the sample configuration file:

```text
src/main/resources/application.properties.example
```

Create a new file in the same directory named:

```text
src/main/resources/application.properties
```

Copy the contents from `application.properties.example` and update the database credentials according to your local MySQL setup.

Example:

```properties
db.driver=com.mysql.cj.jdbc.Driver
db.url=jdbc:mysql://localhost:3306/student_management
db.username=your_username
db.password=your_password
```

> **Note:** The `application.properties` file is excluded from version control using `.gitignore` to avoid committing local database credentials. Only the `application.properties.example` template is included in the repository.

### 4. Build the project

```bash
mvn clean install
```

### 5. Run the application

Execute:

```text
App.java
```

---

## Sample Console Output

```text
===== ADD STUDENT =====

Student saved successfully.

===== VIEW ALL STUDENTS =====
Student{id=11, firstName='Maninder', lastName='Kaur', gender=Female, email='maninder@gmail.com', course='F', semester='2'}
Student{id=20, firstName='Alice', lastName='Johnson', gender=Female, email='alice@example.com', course='Advanced Spring', semester='2'}
Student{id=21, firstName='Alice', lastName='Son', gender=Female, email='alice+1@example.com', course='Spring Framework', semester='3'}
Student{id=22, firstName='Alice', lastName='Jane', gender=Female, email='alice+jane@example.com', course='Spring Framework', semester='4'}

===== SEARCH STUDENT BY ID =====
Student{id=21, firstName='Alice', lastName='Son', gender=Female, email='alice+1@example.com', course='Spring Framework', semester='3'}

===== UPDATE STUDENT =====
Student Updated Successfully
Student{id=21, firstName='Alice', lastName='Son', gender=Female, email='alice+1@example.com', course='Advanced Spring', semester='3'}

===== DELETE STUDENT =====
Student Deleted

===== VIEW ALL STUDENTS =====
Student{id=11, firstName='Maninder', lastName='Kaur', gender=Female, email='maninder@gmail.com', course='F', semester='2'}
Student{id=21, firstName='Alice', lastName='Son', gender=Female, email='alice+1@example.com', course='Advanced Spring', semester='3'}
Student{id=22, firstName='Alice', lastName='Jane', gender=Female, email='alice+jane@example.com', course='Spring Framework', semester='4'}

SMS Notification Sent!
```

---

## Future Improvements

This project will be extended using Spring Boot with:

* REST APIs
* Spring Data JPA
* Bean Validation
* Global Exception Handling
* Logging
* Unit Testing
* Swagger / OpenAPI Documentation
* JWT Authentication
* Docker

---

## Learning Outcomes

Through this project, I gained hands-on experience with:

* Spring IoC Container
* Dependency Injection
* Java-based Configuration
* Bean Management
* Spring JDBC
* JdbcTemplate
* Repository Pattern
* Layered Application Architecture
* MySQL Integration
* Writing clean and maintainable Spring applications

---

## Author

**Maninder Kaur**

This project is part of my Java Backend learning journey toward becoming a Full Stack Java Developer.

GitHub: https://github.com/maninder-kaur-21