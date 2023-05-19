package com.example.restdemo.rest;

import com.example.restdemo.entity.Student;
import com.example.restdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> findALl(){
        System.out.println("@@@@@@@@@@@@@@@@@@");
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> findById(@PathVariable int id){
        Optional<Student> student = studentService.getStudentById(id);
        if(student==null) {
            throw new RuntimeException(" Employee not found");
        }
        return student;
    }

    @PostMapping("/students")
    public Student save(@RequestBody Student student){
        System.out.println("@@@@@@@@@@@@@@@@@"+ student);
//        student.setId(0);
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public String delete(@PathVariable int id){
        studentService.deleteStudent(id);
        return  "employee deleted : "+id;
    }
}

