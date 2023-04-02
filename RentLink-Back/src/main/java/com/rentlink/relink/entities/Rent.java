package com.rentlink.relink.entities;


import com.rentlink.relink.enumuration.Duration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="RL_Rent")
public class Rent extends AbstractEntity {

    @Column(name="R_Subscription_Type")
    private String subscriptionType;

    @ManyToOne
    @JoinColumn(name="R_seller_ID")
    private User sellerId;

    @Column(name="R_Buyer_Full_name")
    private String buyerFullName;

    @Column(name="R_Buyer_Description")
    private String buyerDescription;

    @Column(name="R_Duration")
    @Enumerated(EnumType.STRING)
    private Duration duration;

    @Column(name="R_Price")
    private Long price;

    @Column(name="R_Start_Date")
    private Date startDate;

    @Column(name="R_End_Date")
    private Date endDate;

    @Column(name = "R_Country")
    private String country;
}
