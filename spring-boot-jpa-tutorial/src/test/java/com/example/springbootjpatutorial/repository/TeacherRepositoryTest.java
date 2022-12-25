package com.example.springbootjpatutorial.repository;

import com.example.springbootjpatutorial.entity.Course;
import com.example.springbootjpatutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository testRepository;

    @Test
    public void saveTeacher(){
        Course course1 = Course.builder()
                .title("DSA")
                .credit(6)
                .build();

        Course course2 = Course.builder()
                .title("DAA")
                .credit(6)
                .build();

        Teacher teacher =
                Teacher.builder()
                        .firstName("a")
                        .lastName("c")
                        .courses(List.of(course1,course2) )
                        .build();

        testRepository.save(teacher);
    }
}