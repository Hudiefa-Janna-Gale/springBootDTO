package com.students.Services;

import com.students.Models.Students;
import com.students.ResponseDTO.StudentResponseDTO;
import com.students.StudentCreateDTO.StudentCreateDTO;
import com.students.UpdateDTO.StudentUpdateDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    // list of students
    List<Students> std = new ArrayList<>();

    // all students
    public List<StudentResponseDTO> getAllStudents(){
        return std.stream().map(s-> new StudentResponseDTO(
                s.getId(),
                s.getName(),
                s.getDob()
        )).toList();
    }

    // get one student
    public Students getStudent(UUID studentId){
        for (Students student: std){
            if (student.getId().equals(studentId)){
                return student;
            }
        }
        return null;
    }

    // inserting student
    public Students insertStudent(StudentCreateDTO student) {

        if (student.getDob() == null || student.getDob().isBlank()) {
            throw new RuntimeException("DOB is missing in request");
        }


        Students newStudent = new Students();
        newStudent.setId(UUID.randomUUID());
        newStudent.setName(student.getName());
        newStudent.setDob(student.getDob());
        newStudent.setPassword(student.getPassword());

        std.add(newStudent);
        return newStudent;
    }


    // updating student
    public Students updateStudent(UUID id, StudentUpdateDTO studnet){
        for (Students s : std){
            if (s.getId().equals(id)){
                s.setId(id);
                s.setName(studnet.getName());
                s.setDob(studnet.getDob());
                s.setPassword(studnet.getPassword());
                return s;
            }
        }
        System.out.println("Studemt not found..!!");
        return  null;
    }

    public void deleteStudent(UUID id){
        for (int i = 0; i < std.size(); i++) {
            if (std.get(i).getId().equals(id)){
                std.remove(i);
                return;
            }

        }
        throw new RuntimeException("Student not found "+ id);
    }

}
