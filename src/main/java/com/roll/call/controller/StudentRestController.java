package com.roll.call.controller;

import com.roll.call.entity.Student;
import com.roll.call.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class StudentRestController {

    @Autowired
    private StudentMapper studentMapper;


    @RequestMapping("/aj_sel_student_by_all")
    @ResponseBody
    public List<Student> selStudentByAll() {
        return studentMapper.selStudentByAll();
    }

    @RequestMapping("/aj_ins_student")
    @ResponseBody
    public int insStudent(@RequestParam Map<String, Object> maps) {
        String studentId = String.valueOf(maps.get("studentId"));
        String name = String.valueOf(maps.get("name"));
        int called = Integer.parseInt(String.valueOf(maps.get("called")));
        int correct = Integer.parseInt(String.valueOf(maps.get("correct")));
        Student student = new Student(studentId, name, called, correct);
        return studentMapper.insStudent(student) ? 0 : -1;
    }

    @RequestMapping("/aj_upd_student_by_id")
    @ResponseBody
    public int updStudentById(@RequestParam Map<String, Object> maps) {
        int id = Integer.parseInt(String.valueOf(maps.get("id")));
        String studentId = String.valueOf(maps.get("studentId"));
        String name = String.valueOf(maps.get("name"));
        int called = Integer.parseInt(String.valueOf(maps.get("called")));
        int correct = Integer.parseInt(String.valueOf(maps.get("correct")));
        Student student = new Student(id, studentId, name, called, correct);
        return studentMapper.updStudentById(student) ? 0 : -1;
    }


    @RequestMapping("/aj_del_student_by_studentId")
    @ResponseBody
    public int delStudentById(@RequestParam Map<String, Object> maps) {
        int id = Integer.parseInt(String.valueOf(maps.get("id")));
        return studentMapper.delStudentById(id) ? 0 : -1;
    }

}
