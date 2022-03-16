package id.ac.uin.student.repository;

import id.ac.uin.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Query method
    Optional<Student> findByEmail(String email);
}
