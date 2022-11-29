package com.foxminded.universitycms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student extends Person {

    @Column
    private int averageGrade;

    @ManyToMany
    @JoinTable
    private List<Lesson> lessons;
}
