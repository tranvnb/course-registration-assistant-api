package com.lf.courseman.repository;

import com.lf.courseman.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("courseRepository")
public interface CourseRepository extends IRepository<Course, UUID> {

//    @Query("SELECT e FROM Expense e WHERE e.amount >= :amount")
//    public List<Expense> listItemsWithPriceOver(@Param("amount") float amount);
}
