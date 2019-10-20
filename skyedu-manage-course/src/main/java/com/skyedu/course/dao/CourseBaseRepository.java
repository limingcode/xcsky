package com.skyedu.course.dao;


import com.skyedu.common.domain.course.CourseBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseBaseRepository extends JpaRepository<CourseBase,String> {
}
