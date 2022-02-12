package com.raoni.crudspring.controller;

import java.util.List;

import com.raoni.crudspring.model.Course;
import com.raoni.crudspring.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/courses")
public class CoursesController {
    
    private final CourseRepository courseRepository;

    @GetMapping
    // @RequestMapping(method = RequestMethod.GET)
    public List<Course> list (){
        return courseRepository.findAll();
    }
}
