package com.example.testProject.controller;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CourseCompletionControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void averageScore() {
        String body = this.testRestTemplate.getForObject("/score/average?std_id=1", String.class);
        assertThat(body).contains("4.0");
    }

    @Test
    void finalScore() {
        String body = this.testRestTemplate.getForObject("/score/final?std_id=1", String.class);
        assertThat(body).contains("4");
    }
}