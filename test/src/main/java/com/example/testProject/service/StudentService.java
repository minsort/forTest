package com.example.testProject.service;

import com.example.testProject.models.Student;
import com.example.testProject.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    final
    StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    //Добавление студента в таблицу студентов
    public void save (Student student){
        studentRepository.save(student);
    }
}
