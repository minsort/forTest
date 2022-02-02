package com.example.testProject.service;

import com.example.testProject.repository.StudСourseRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudСourseServiceTest {

    @Autowired
    StudСourseService studСourseService;

    @MockBean
    StudСourseRepository studСourseRepository;

    @Test
    void addStudentOnCourse() {
        studСourseService.addStudentOnCourse(4L,1L);
        Mockito.verify(studСourseRepository, Mockito.times(1)).addStudentsOnCourse(4L, 1L);
    }

    @Test
    void delStudentsFromCourse() {
        studСourseService.delStudentsFromCourse(4L,1L);
        Mockito.verify(studСourseRepository, Mockito.times(1)).delStudentsFromCourse(4L, 1L);
    }
}