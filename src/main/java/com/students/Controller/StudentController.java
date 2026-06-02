package com.students.Controller;

import com.students.Models.Students;
import com.students.ResponseDTO.StudentResponseDTO;
import com.students.Services.StudentService;
import com.students.StudentCreateDTO.StudentCreateDTO;
import com.students.UpdateDTO.StudentUpdateDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    // con injection
    private final StudentService stdService;
    StudentController(StudentService stdServie){
        this.stdService =stdServie;
    }

    // creating student
    @PostMapping
    public StudentResponseDTO addNewStudent(@Valid @RequestBody StudentCreateDTO student){
        Students savedStudent = stdService.insertStudent(student);
        return  new StudentResponseDTO(
                savedStudent.getId(),
                savedStudent.getName(),
                savedStudent.getDob()
        );

    }
    // get all studemts
    @GetMapping
    public List<StudentResponseDTO>  getAllStudent(){
        return  stdService.getAllStudents();
    }

    // get one student
    @GetMapping("/{id}")
    public Object getStudentById(@PathVariable UUID id){
        return stdService.getStudent(id);
    }

    // update student
    @PutMapping("/{id}")
    public Object updateStudent(@PathVariable UUID id , @RequestBody StudentUpdateDTO student){
        return stdService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public String dleteStudent(@PathVariable UUID id){
        stdService.deleteStudent(id);
        return "Student deleted successfully";
    }
}