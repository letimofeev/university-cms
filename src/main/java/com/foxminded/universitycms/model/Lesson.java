package com.foxminded.universitycms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.time.DayOfWeek;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Time startTime;

    @Column
    private Time endTime;

    @ManyToOne
    private Group group;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Column
    private DayOfWeek dayOfWeek;

    @OneToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
}
