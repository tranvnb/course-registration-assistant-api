package com.lf.courseman.repository;

import com.lf.courseman.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("courseRepository")
public interface CourseRepository extends IRepository<Course, UUID> {

//    @Query("SELECT c FROM Course c WHERE c.name like %:name%")
//    public List<Course> listCoursesWithName(@Param("name") String name);
}
