package com.roll.call.entity;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Record {

    private int id;
    private String studentName;
    private String result;
    private String time;

    public Record(int id, String studentName, String result) {
        this.id = id;
        this.studentName = studentName;
        this.result = result;
    }

    public Record(String studentName, String result) {
        this.studentName = studentName;
        this.result = result;
    }
}
