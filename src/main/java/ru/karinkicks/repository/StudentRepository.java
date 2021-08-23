package ru.karinkicks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.karinkicks.entity.Student;

@Repository
public interface StudentRepository extends  JpaRepository<Student, Long> {

}
