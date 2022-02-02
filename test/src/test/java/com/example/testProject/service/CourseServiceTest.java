package com.example.testProject.service;

import com.example.testProject.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseServiceTest {

    @Autowired
    CourseService courseService;

    @MockBean
    CourseRepository courseRepository;
    @Test
    void allCourse() {
        courseService.allCourse(1L);
        Mockito.verify(courseRepository, Mockito.times(1)).allCoursesOfStudents(1L);
    }
}