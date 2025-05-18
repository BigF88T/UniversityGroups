package ru.safonov.apps.universitygroups.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "groups_students")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<Student> students;

    public Group() {
    }

    public Group(Long id, String number) {
        this.id = id;
        this.number = number;
    }

    public Group(String number) {
        this.number = number;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
