package com.managementtool.apidata.course;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAllCourses(){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses:: add);
        return courses;
    }

     // Time Complexity will be O(n)
     public Course getCourse(String id){
        return  courseRepository.findById(id).get();
      }

      public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(String id, Course course){
       courseRepository.save(course);
    }

    public void deleteCourse(String id){
        Course course = getCourse(id);
        courseRepository.delete(course);
    }
    
}
