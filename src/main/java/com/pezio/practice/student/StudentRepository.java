package com.pezio.practice.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Here the Student refers to the Student class and not Student table in are DB. (JPAQL)
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentbyEmail(String email);
}
