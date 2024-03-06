package com.wm.crudSpringBoot.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name="email_address", unique = true, nullable = false)
    private String email;
}
