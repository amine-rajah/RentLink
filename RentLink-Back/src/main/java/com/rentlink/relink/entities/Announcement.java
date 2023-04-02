package com.rentlink.relink.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="RL_Announcement")
public class Announcement extends AbstractEntity{

    @Column(name="A_Title")
    private String title;

    @Column(name="A_Description")
    private String description;

    @Column(name="A_Price")
    private Long price;

    @Column(name="A_Adress")
    private String location;

    @ManyToOne
    @JoinColumn(name="A_Seller_ID")
    private User sellerId;

    @Column(name = "U_IS_DELETED")
    private boolean isDeleted;

}
