package com.roll.call.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {

    private int id;
    private String studentId;
    private String name;
    private int called;
    private int correct;

    public Student(String studentId, String name, int called, int correct) {
        this.studentId = studentId;
        this.name = name;
        this.called = called;
        this.correct = correct;
    }
}
