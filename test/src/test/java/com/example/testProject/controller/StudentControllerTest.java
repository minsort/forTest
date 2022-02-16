package com.example.testProject.controller;

import com.example.testProject.models.Student;
import com.example.testProject.repository.StudentRepository;
import com.example.testProject.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class StudentControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private StudentService service;
    @MockBean
    private StudentRepository repository;

    @Test
    void addStudents() throws  Exception{
        service = Mockito.mock(StudentService.class);
        Student student = new Student(44l, "Mike Device", 941919191);
        Mockito.when(repository.save(Mockito.any())).thenReturn(student);
        mockMvc.perform(
                post("/students/new")
                        .content(objectMapper.writeValueAsString(student))
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isCreated())
                .andExpect(content().json(objectMapper.writeValueAsString(student)));
    }
}