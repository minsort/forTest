package com.example.testProject.service;

import com.example.testProject.models.Professor;
import com.example.testProject.repository.ProfessorRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProfessorServiceTest {

    @Autowired
    ProfessorService professorService;

    @MockBean
    ProfessorRepository professorRepository;
    Professor professor;

    @Test
    void addProfessors() {
        professorService.addProfessors(professor);
        Mockito.verify(professorRepository, Mockito.times(1)).save(professor);
    }

    @Test
    void delProf() {
        professorService.delProf(1L);
        Mockito.verify(professorRepository, Mockito.times(1)).delProf(1L);
    }
}






