package com.roll.call.mapper;

import com.roll.call.entity.Record;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RecordMapper {

    @Select("select * from record  order by time desc")
    List<Record> selRecordByAll();

    @Insert("insert into record(studentName,result) values(#{studentName},#{result})")
    boolean insRecord(Record record);

    @Update("update record set studentName=#{studentName},result=#{result} where id=#{id}")
    boolean updRecordById(Record record);

}
