package com.lf.courseman.service;


import com.lf.courseman.entity.Course;
import com.lf.courseman.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CourseService implements IService<Course> {

    private IRepository courseRepository;

    @Autowired
    public CourseService(@Qualifier("courseRepository") IRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void add(Course obj) {
        courseRepository.save(obj);
    }

    @Override
    public void delete(UUID Id) {
        if (courseRepository.existsById(Id)) {
            courseRepository.deleteById(Id);
        };
    }

    @Override
    public void update(UUID Id, Course obj) {
        Optional<Course> courseOptional = courseRepository.findById(Id);
        if (courseOptional.isPresent()) {
            Course course = courseOptional.get();
            course.setName(obj.getName());
            course.setEnd_date(obj.getEnd_date());
            course.setStart_date(obj.getStart_date());
            courseRepository.save(course);
        }
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getById(UUID Id) {
        return courseRepository.findById(Id);
    }
}
