package com.example.testProject.service;

import com.example.testProject.repository.CourseCompletionRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseCompletionServiceTest {

    @Autowired
    private CourseCompletionService courseCompletionService;

    @MockBean
    CourseCompletionRepository courseCompletionRepository;

    @Test
    void averageScore() {
        courseCompletionService.averageScore(1L);
        Mockito.verify(courseCompletionRepository, Mockito.times(1)).averageScore(1L);
    }

    @Test
    void finalScore() {
        courseCompletionService.finalScore(1L);
        Mockito.verify(courseCompletionRepository, Mockito.times(1)).finalScore(1L);
    }
}