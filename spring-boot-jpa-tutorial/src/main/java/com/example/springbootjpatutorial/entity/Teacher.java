package com.example.springbootjpatutorial.entity;

import jakarta.persistence.*;
import jakarta.persistence.SequenceGenerator;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Teacher {

    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence"
    )
    private Long teacherId;
    private String firstName;
    private String lastName;

@OneToMany(
cascade = CascadeType.ALL
)
@JoinColumn(
        name = "teacher_id",
        referencedColumnName = "teacherId"
)
@ToString.Exclude
private List<Course> courses;
}
