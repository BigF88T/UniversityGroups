package ru.safonov.apps.universitygroups.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.safonov.apps.universitygroups.dto.GroupResponse;
import ru.safonov.apps.universitygroups.mapper.GroupMapper;
import ru.safonov.apps.universitygroups.models.Group;
import ru.safonov.apps.universitygroups.repositories.GroupRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class GroupService {

    private final GroupRepository groupRepository;
    private final GroupMapper groupMapper;

    public GroupService(GroupRepository groupRepository, GroupMapper groupMapper) {
        this.groupRepository = groupRepository;
        this.groupMapper = groupMapper;
    }

    public List<GroupResponse> findAll() {
        return groupRepository.findAll().stream().map(groupMapper::toResp).toList();
    }

    public Group getById(long groupId) {
        return groupRepository.findById(groupId)
                .orElseThrow(() -> new RuntimeException(String.format("Group with id: %s not found", groupId)));
    }

    @Transactional
    public Group save(Group group) {
        return groupRepository.save(group);
    }

    public Group findOne(long groupId) {
        return groupRepository.findById(groupId)
                .orElseThrow(() -> new RuntimeException(String.format("Группа с id: %d не найдена", groupId)));
    }
}