package com.wm.crudSpringBoot.controller;


import com.wm.crudSpringBoot.Entity.Student;
import com.wm.crudSpringBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    //TODO: constructor para inicializar el studentservice
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //TODO: metodo que me devuelve una lista de estudiantes
    @GetMapping
    public List<Student> getAll() {
        return studentService.getStudents();
    }

    //TODO: metod que obtiene por medio del id a un estudiante
    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId) {
        return studentService.getStudent(studentId);
    }

    //TODO: enviamos en en el body a un estudiante
    @PostMapping
    public void saveUpdate(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
    }

    //TODO: enviamos como parametros el id del estudiante para eliminar el estudiante
    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("studentId") Long studentId) {
        studentService.delete(studentId);
    }

}
