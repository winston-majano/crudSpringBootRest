package com.wm.crudSpringBoot.service;

import com.wm.crudSpringBoot.Entity.Student;
import com.wm.crudSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    //TODO: obtenemos una lista de estudiantes
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    //TODO: buscamos un estudiante por su id
    public Optional<Student> getStudent(Long id) {
        return studentRepository.findById(id);
    }

    //TODO: guarda o actualiza un estudiante
    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }

    //TODO: elimina un estudiante por su id
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
