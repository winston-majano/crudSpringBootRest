package com.wm.crudSpringBoot.repository;

import com.wm.crudSpringBoot.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//TODO: creamos una interface de tipo repositorio que extiende de JpaRepository
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
