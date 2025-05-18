package ru.safonov.apps.universitygroups.dto;

public class StudentResponse {
    private long id;
    private String name;
    private String dateOfAdoption;
    private long groupId;

    public StudentResponse(long id, String name, String dateOfAdoption, long groupId) {
        this.id = id;
        this.name = name;
        this.dateOfAdoption = dateOfAdoption;
        this.groupId = groupId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(String dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }
}
