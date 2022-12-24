package com.example.springbootjpatutorial.repository;

import com.example.springbootjpatutorial.entity.Guardian;
import com.example.springbootjpatutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("tiwarivedant.1690@gmail.com")
                .firstName("vedant")
                .lastName("tiwari")
//                .guardianName("Rajeev")
//                .guardianEmail("tiwarivedant.1690@gmail.com")
//                .guardianMobile("9999999")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .name("Rajeev")
                .email("tiwarivedant.1690@gmail.com")
                .mobile("9999999")
                .build();

        Student student = Student.builder()
                .emailId("tiwarived1ant.1690@gmail.com")
                .firstName("v1edant")
                .lastName("ti1wari")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }

    @Test
    public void printAllStudent() {
        List<Student> studentList = studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstName() {

        List<Student> students =
                studentRepository.findByFirstName("vedant");

        System.out.println("Student = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining() {

        List<Student> students =
                studentRepository.findByFirstNameContaining("ve");

        System.out.println("Student = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName() {
        List<Student> students =
                studentRepository.findByGuardianName("Rajeev");
        System.out.println("students = " + students);
    }

    @Test
    public void printGetStudentByEmailAddress() {
        Student students =
                studentRepository.getStudentByEmailAddress("tiwarivedant.1690@gmail.com");
        System.out.println("students = " + students);
    }

    @Test
    public void printGetStudentByEmailAddressNative() {
        Student students =
                studentRepository.getStudentByEmailAddressNative(
                        "tiwarivedant.1690@gmail.com"
                );
        System.out.println("students = " + students);
    }

    @Test
    public void printGetStudentByEmailAddressNativeNamedParam() {
        Student students =
                studentRepository.getStudentByEmailAddressNativeNamedParams(
                        "tiwarivedant.1690@gmail.com"
                );
        System.out.println("students = " + students);
    }

    public void updateStudentNameByEmailId(){

    }
}