package com.roll.call.mapper;

import com.roll.call.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from student")
    List<Student> selStudentByAll();

    @Insert("insert into student(studentId,name,called,correct) values(#{studentId},#{name},#{called},#{correct})")
    boolean insStudent(Student student);

    @Update("update student set studentId= #{studentId},name= #{name},called= #{called},correct= #{correct} where id= #{id}")
    boolean updStudentById(Student student);

    @Delete("delete from student where id=#{id}")
    boolean delStudentById(int id);


}
