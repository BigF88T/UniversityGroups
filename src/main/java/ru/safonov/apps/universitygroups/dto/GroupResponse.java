package ru.safonov.apps.universitygroups.dto;

public class GroupResponse {
    private Long id;
    private String number;
    private long studentCount;

    public GroupResponse(Long id, String number, long studentCount) {
        this.id = id;
        this.number = number;
        this.studentCount = studentCount;
    }

    public GroupResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(long studentCount) {
        this.studentCount = studentCount;
    }
}
