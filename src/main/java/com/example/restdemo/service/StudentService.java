package com.example.restdemo.service;

import java.util.List;
import java.util.Optional;

import com.example.restdemo.dao.StudentDao;
import com.example.restdemo.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentDao studentRepository;

    public StudentService(StudentDao studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        System.out.println("@@@@@@@@@@@@ hiiii");
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

}


