package com.lf.courseman.repository;

import com.lf.courseman.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("studentRepository")
public interface StudentRepository extends IRepository<Student, UUID> {

//    public List<Student>
}
