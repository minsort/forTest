package com.example.testProject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "stud_course", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "students_id", "course_id" }) } )
public class StudCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "students_id")
    private Student student;

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;
}
