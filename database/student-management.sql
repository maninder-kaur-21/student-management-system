-- ==========================================
-- Student Management System Database Script
-- ==========================================

-- Drop database if it already exists (Optional)
DROP DATABASE IF EXISTS student_management_db;

-- Create Database
CREATE DATABASE student_management_db;

-- Use Database
USE student_management_db;

-- ==========================================
-- Create Students Table
-- ==========================================

CREATE TABLE students (
                          student_id INT PRIMARY KEY AUTO_INCREMENT,
                          first_name VARCHAR(50) NOT NULL,
                          last_name VARCHAR(50) NOT NULL,
                          email VARCHAR(100) NOT NULL UNIQUE,
                          phone VARCHAR(15),
                          gender ENUM('Male', 'Female', 'Other') NOT NULL,
                          date_of_birth DATE,
                          course VARCHAR(100) NOT NULL,
                          semester INT NOT NULL,
                          address VARCHAR(255),
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                              ON UPDATE CURRENT_TIMESTAMP
);

-- ==========================================
-- Insert Sample Records
-- ==========================================

INSERT INTO students
(first_name, last_name, email, phone, gender, date_of_birth, course, semester, address)
VALUES
    ('Rahul', 'Sharma', 'rahul.sharma@example.com', '9876543210', 'Male', '2002-04-15', 'Computer Science', 5, 'Delhi'),

    ('Priya', 'Verma', 'priya.verma@example.com', '9876543211', 'Female', '2003-01-20', 'Information Technology', 3, 'Mumbai');


-- ==========================================
-- Verify Data
-- ==========================================

SELECT * FROM students;
