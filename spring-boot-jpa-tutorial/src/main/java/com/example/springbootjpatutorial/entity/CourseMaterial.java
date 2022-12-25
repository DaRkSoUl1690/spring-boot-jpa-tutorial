package com.example.springbootjpatutorial.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.WhereJoinTable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {

    @Id
    @SequenceGenerator(
            name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_material_sequence"
    )
   private Long courseMaterialId;
   private String url;


   @OneToOne(
           cascade = CascadeType.ALL,
           optional = false
   )
   @JoinColumn(
           name = "course_id",
           referencedColumnName = "courseId"
   )
   private Course course;

}
