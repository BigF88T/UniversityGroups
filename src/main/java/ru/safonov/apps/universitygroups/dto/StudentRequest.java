package ru.safonov.apps.universitygroups.dto;

import java.time.LocalDateTime;

public class StudentRequest {

    private String name;
    private LocalDateTime dateOfAdoption;
    private Long groupId;

    public StudentRequest(String name, LocalDateTime dateOfAdoption, Long groupId) {
        this.name = name;
        this.dateOfAdoption = dateOfAdoption;
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(LocalDateTime dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
