package com.monlau.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Table(name = "student")
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Student {

    @Id
    private Integer id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    public Set<Course> likedCourses;


}
