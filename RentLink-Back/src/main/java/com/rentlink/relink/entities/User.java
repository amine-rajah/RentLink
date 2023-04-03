package com.rentlink.relink.entities;


import com.rentlink.relink.enumuration.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User extends AbstractEntity {

    @Column(name = "U_First Name")
    private String fullName;

    @Column(name = "U_Last Name")
    private String lastName;

    @Column(name = "U_Bio")
    private String bio;

    @Column(name = "U_Email")
    private String email;

    @Column(name = "U_Password")
    private String password;

    @Column(name = "U_Role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "seller")
    private List<Announcement> announcements;
}
