package ru.karinkicks.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.karinkicks.entity.Student;
import ru.karinkicks.repository.StudentRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public List<Student> findAll() {
        return studentRepository.findAll().stream().collect(Collectors.toList());
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
