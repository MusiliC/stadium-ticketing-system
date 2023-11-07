package com.cee.tech.app.model;


import jakarta.persistence.*;

@Entity
@Table(name="User",
             uniqueConstraints = {@UniqueConstraint(columnNames = {"ID"})})
public class UserEmployeeOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false,unique = true, length = 11)
    private String id;

    @Column(name="USERNAME", length=20, nullable=false)
    private String username;

    @Column(name="PASSWORD", length=20, nullable=false)
    private String password;
}
