package com.roll.call.controller;

import com.roll.call.entity.Record;
import com.roll.call.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class RecordRestController {

    @Autowired
    private RecordMapper recordMapper;


    @RequestMapping("/aj_sel_record_by_all")
    @ResponseBody
    public List<Record> selRecordByAll() {
        return recordMapper.selRecordByAll();
    }

    @RequestMapping("/aj_ins_record")
    @ResponseBody
    public int insRecord(@RequestParam Map<String, Object> maps) {
        String studentName = String.valueOf(maps.get("studentName"));
        String result = String.valueOf(maps.get("result"));
        Record record = new Record(studentName, result);
        return recordMapper.insRecord(record) ? 0 : -1;
    }

    @RequestMapping("/aj_upd_record_by_id")
    @ResponseBody
    public int updRecordById(@RequestParam Map<String, Object> maps) {
        int id = Integer.parseInt(String.valueOf(maps.get("id")));
        String studentName = String.valueOf(maps.get("studentName"));
        String result = String.valueOf(maps.get("result"));
        Record record = new Record(id, studentName, result);
        return recordMapper.updRecordById(record) ? 0 : -1;
    }


}
