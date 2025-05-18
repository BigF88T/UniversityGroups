package ru.safonov.apps.universitygroups.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.safonov.apps.universitygroups.models.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

}
