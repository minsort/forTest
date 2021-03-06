package com.example.testProject.service;

import com.example.testProject.repository.CourseCompletionRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CourseCompletionService {
    private final CourseCompletionRepository courseCompletionRepository;

    public CourseCompletionService(CourseCompletionRepository courseCompletionRepository) {
        this.courseCompletionRepository = courseCompletionRepository;
    }

    //Получаем текущий средний балл
    public Float averageScore(@RequestParam("std_id") Long students_id) {
        return courseCompletionRepository.averageScore(students_id);
    }

    //Получит финальную отметку
    public Integer finalScore(@RequestParam("std_id") Long students_id) {
        return courseCompletionRepository.finalScore(students_id);
    }
}

















