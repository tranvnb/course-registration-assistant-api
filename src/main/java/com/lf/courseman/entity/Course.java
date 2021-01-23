package com.lf.courseman.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Course")
@Table(name = "course")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false)
    private UUID Id;

    @NotBlank
    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "start_date", columnDefinition = "Date")
    private LocalDate start_date;

    @Column(name = "end_date", columnDefinition = "Date")
    private LocalDate end_date;

    @ManyToMany(cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST
    }, mappedBy = "courses", fetch = FetchType.LAZY)
    private Set<Student> students;

}
