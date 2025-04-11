package com.example.httpmethods.controller;


import com.example.httpmethods.model.Student;
import com.example.httpmethods.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;


    @GetMapping("/")
    public String greet(){
        return service.greet();
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        return service.getStudents();
    }

    @GetMapping("students/{rno}")
    public Student getstudentbyrno(@PathVariable("rno") int roll){
        return service.getstudentbyrno(roll);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody  Student student){
        return service.addStudent(student);
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable int rno){
        return service.deleteStudent(rno);
    }

}
