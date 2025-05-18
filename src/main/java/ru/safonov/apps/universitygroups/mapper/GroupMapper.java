package ru.safonov.apps.universitygroups.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.safonov.apps.universitygroups.dto.GroupResponse;
import ru.safonov.apps.universitygroups.models.Group;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GroupMapper {

    default GroupResponse toResp(Group group) {
        return new GroupResponse(
                group.getId(),
                group.getNumber(),
                group.getStudents().size()
        );
    }

}
