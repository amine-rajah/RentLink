package com.rentlink.relink.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="announcements")
public class Announcement extends AbstractEntity{

    @Column(name="A_Title")
    private String title;

    @Column(name="A_Description")
    private String description;

    @Column(name="A_Price")
    private BigDecimal price;

    @Column(name="A_Adress")
    private String location;

    @Column(name = "U_IS_DELETED")
    private boolean isDeleted;

    @OneToMany(mappedBy = "announcement")
    private List<Rent> rents;

}
