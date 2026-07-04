package org.maninder.model;

/**
 * Represents a student in the Student Management System.
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private String course;
    private int semester;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String email, Gender gender, String course, int semester) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.course = course;
        this.semester = semester;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + (gender != null ? gender.getValue() : '-') +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
