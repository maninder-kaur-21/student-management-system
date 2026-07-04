package org.maninder.mapper;

import org.maninder.model.Gender;
import org.maninder.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Maps a database row from the students table
 * to a Student object.
 */
public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("student_id"));
        student.setFirstName(rs.getString("first_name"));
        student.setLastName(rs.getString("last_name"));
        student.setEmail(rs.getString("email"));
        student.setGender(Gender.fromValue(rs.getString("gender")));
        student.setCourse(rs.getString("course"));
        student.setSemester(rs.getInt("semester"));

        return student;
    }
}
