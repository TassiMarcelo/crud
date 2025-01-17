package com.example.crudrapido.service;

import com.example.crudrapido.entity.Student;
import com.example.crudrapido.reporitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudents(Long id){
        return studentRepository.findById(id);
    }

    public void saveOrUdpate(Student student){
        studentRepository.save(student);
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
