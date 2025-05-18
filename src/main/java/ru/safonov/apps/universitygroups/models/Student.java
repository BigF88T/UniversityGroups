package ru.safonov.apps.universitygroups.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime dateOfAdoption;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;

    public Student() {
    }

    public Student(String name, LocalDateTime dateOfAdoption, Group group) {
        this.name = name;
        this.dateOfAdoption = dateOfAdoption;
        this.group = group;
    }

    public Student(Long id, String name, LocalDateTime dateOfAdoption) {
        this.id = id;
        this.name = name;
        this.dateOfAdoption = dateOfAdoption;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setDateOfAdoption(LocalDateTime dateOfAbove) {
        this.dateOfAdoption = dateOfAbove;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
