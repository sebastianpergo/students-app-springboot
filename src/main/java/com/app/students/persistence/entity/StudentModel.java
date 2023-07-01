package com.app.students.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_student")
public class StudentModel {
    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    @Getter @Setter
    private String name;

    @Column(nullable = true,length = 50)
    @Getter @Setter
    private String secondName;

    @Column(nullable = false, length = 50)
    @Getter @Setter
    private String lastName;

    @Column(nullable = false, length = 50, unique = true)
    @Getter @Setter
    private String email;

    // Empty constructor
    public StudentModel(Long id, String name, String secondName, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.email = email;
    }

    // To String
    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
