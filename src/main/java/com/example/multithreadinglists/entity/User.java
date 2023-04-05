package com.example.multithreadinglists.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name="User_data")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="Gender")
    private String gender;
}
