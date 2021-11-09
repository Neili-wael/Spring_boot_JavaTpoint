package com.javatpoint.controller;

import com.javatpoint.model.Student;
import com.javatpoint.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
final
StudentService studentservice;

    public StudentController(StudentService studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping("/student/{id}")
private List<Student> getAllStudent(){

    return studentservice.getAllStudent();
}
@GetMapping("student/id")
private Student getStudent(@PathVariable("id") int id){
    return studentservice.getStudentById(id);
}
@DeleteMapping("/student/{id}")
private void deleteStudent(int id ){

    studentservice.delete(id);
    }
 @PostMapping("/student")
 private int saveStudent(@RequestBody Student student){
    studentservice.saveOrUpdate(student);
    return  student.getId();
 }

}
