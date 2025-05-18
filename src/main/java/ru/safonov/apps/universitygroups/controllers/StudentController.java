package ru.safonov.apps.universitygroups.controllers;

import org.springframework.web.bind.annotation.*;
import ru.safonov.apps.universitygroups.dto.StudentRequest;
import ru.safonov.apps.universitygroups.dto.StudentResponse;
import ru.safonov.apps.universitygroups.facade.StudentFacade;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentFacade studentFacade;

    public StudentController(StudentFacade studentFacade) {
        this.studentFacade = studentFacade;
    }

    @PostMapping("/new")
    public StudentResponse create(@RequestBody StudentRequest req) {
        return studentFacade.createNewStudent(req);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long studentId) {
        studentFacade.deleteStudent(studentId);
    }
}
