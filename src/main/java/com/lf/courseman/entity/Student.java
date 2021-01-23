package com.lf.courseman.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Data
@Entity(name = "Student")
@Table(name = "student", uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique", columnNames = "email")})
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;

    @NotBlank
    @Email
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "name", columnDefinition = "varchar", length = 100)
    private String name;

    @NotNull
    @Column(name = "dob", columnDefinition = "Date")
    private LocalDate dob;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(
                name = "course_id"
        ),
        inverseJoinColumns = @JoinColumn(
                name = "student_id"
        )
    )
    private Set<Course> courses;
}
