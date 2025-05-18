package ru.safonov.apps.universitygroups.facade;

import org.springframework.stereotype.Component;
import ru.safonov.apps.universitygroups.dto.StudentRequest;
import ru.safonov.apps.universitygroups.dto.StudentResponse;
import ru.safonov.apps.universitygroups.models.Student;
import ru.safonov.apps.universitygroups.services.GroupService;
import ru.safonov.apps.universitygroups.services.StudentService;

import java.time.format.DateTimeFormatter;

@Component
public class StudentFacade {

    private final StudentService studentService;
    private final GroupService groupService;

    public StudentFacade(StudentService studentService, GroupService groupService) {
        this.studentService = studentService;
        this.groupService = groupService;
    }

    public StudentResponse createNewStudent(StudentRequest req) {
        Student newStudent = new Student(
                req.getName(),
                req.getDateOfAdoption(),
                groupService.getById(req.getGroupId())
        );

        newStudent = studentService.save(newStudent);

        return new StudentResponse(
                newStudent.getId(),
                newStudent.getName(),
                newStudent.getDateOfAdoption()
                        .toLocalDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                newStudent.getGroup().getId());
    }

    public void deleteStudent(long id) {
        studentService.delete(id);
    }
}
