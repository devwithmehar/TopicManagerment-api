package com.managementtool.apidata.course;

import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses:: add);
        return courses;
    }

     // Time Complexity will be O(n)
     public Course getCourse(String id){
        return  courseRepository.findById(id).get();
      }

      public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse( Course course){
       courseRepository.save(course);
    }

    public void deleteCourse(String id){
        Course course = getCourse(id);
        courseRepository.delete(course);
    }
    
}
