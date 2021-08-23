package ru.karinkicks.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.karinkicks.entity.Student;
import ru.karinkicks.service.StudentService;

import java.util.NoSuchElementException;

@Controller
@AllArgsConstructor
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping( "/add")
    public String getNewStudent(ModelMap model){
        model.addAttribute("student", new Student());
        return "add";
    }

    @PostMapping( "/add")
    public String save(Student student, ModelMap model){
        studentService.save(student);
        return findAll(model);
    }

    @GetMapping( "/{id}")
    public String getStudent(@PathVariable Long id, ModelMap model){
        Student student = studentService.findById(id).get();
        model.addAttribute("student", student);
        return "update";
    }

    @PostMapping("/update")
    public String updateStudent(Student student, ModelMap model) {
        studentService.save(student);
        return findAll(model);
    }

    @GetMapping(value = { "/index" })
    public String index(ModelMap model) {
        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);
        return "index";
    }

    @GetMapping(value = { "/students" })
    public String findAll(ModelMap model) {
        model.addAttribute("students", studentService.findAll());
        return "students";
    }

    @PostMapping( "/{id}")
    public String deleteById(@PathVariable Long id, ModelMap model) {
        studentService.deleteById(id);
        return findAll(model);
    }

}

