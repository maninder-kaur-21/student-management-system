package org.maninder.repository;

import org.maninder.mapper.StudentRowMapper;
import org.maninder.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Student> studentRowMapper = new StudentRowMapper();

    public StudentRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveStudent(Student student) {
        String sql = """
                INSERT INTO students
                (first_name,last_name,email,course, gender, semester)
                VALUES (?,?,?,?,?,?)
                """;

        return jdbcTemplate.update(sql, student.getFirstName(), student.getLastName(), student.getEmail(), student.getCourse(), student.getGender().getValue(), student.getSemester());
    }

    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, studentRowMapper);
    }

    public Student getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE student_id = ?";
        return jdbcTemplate.queryForObject(sql, studentRowMapper, id);
    }

    public int updateStudent(Student student) {

        String sql = """
                UPDATE students
                SET first_name=?,
                    last_name=?,
                    gender=?,
                    email=?,
                    course=?,
                    semester=?
                WHERE student_id=?
                """;

        return jdbcTemplate.update(sql, student.getFirstName(), student.getLastName(), student.getGender().getValue(), student.getEmail(), student.getCourse(), student.getSemester(), student.getId());
    }

    public int deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE student_id=?";

        return jdbcTemplate.update(sql, id);
    }
}
