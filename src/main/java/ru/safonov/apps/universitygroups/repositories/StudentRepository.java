package ru.safonov.apps.universitygroups.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.safonov.apps.universitygroups.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Integer countByGroup_Id(long groupId);
}
