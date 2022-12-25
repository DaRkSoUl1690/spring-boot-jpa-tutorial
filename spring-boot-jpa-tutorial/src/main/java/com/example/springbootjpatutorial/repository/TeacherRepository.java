package com.example.springbootjpatutorial.repository;

import com.example.springbootjpatutorial.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {

}
