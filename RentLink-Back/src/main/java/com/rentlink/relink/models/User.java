package com.rentlink.relink.models;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "Full Name")
    private String fullName;

    @Column(name = "Bio")
    private String bio;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "Avatar")
    private String image;
}
