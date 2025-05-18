package ru.safonov.apps.universitygroups.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.safonov.apps.universitygroups.models.Student;
import ru.safonov.apps.universitygroups.repositories.GroupRepository;
import ru.safonov.apps.universitygroups.repositories.StudentRepository;

@Service
@Transactional(readOnly = true)
public class StudentService {

    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    public StudentService(StudentRepository studentRepository, GroupRepository groupRepository) {
        this.studentRepository = studentRepository;
        this.groupRepository = groupRepository;
    }

    @Transactional
    public Student save(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Transactional
    public void delete(long studentId){
        studentRepository.deleteById(studentId);
    }
}
