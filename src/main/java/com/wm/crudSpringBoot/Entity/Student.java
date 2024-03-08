package com.wm.crudSpringBoot.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_student")
@Data
public class Student {
    //TODO: generamos el id autoincrementable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    //TODO: cambiamos el nombre de la columna y ademas le decimos que este campo no sea nulo
    @Column(name="email_address", unique = true, nullable = false)
    private String email;
}
