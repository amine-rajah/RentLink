package com.rentlink.relink.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @CreatedDate
    // @Column(name="CreationDate", nullable = false)
    // @JsonIgnore
    // private Instant creationDate;

    // @LastModifiedDate
    // @Column(name="LastModifiedDate")
    // @JsonIgnore
    // private Instant lastUpdateDate;

    // @Column(name = "Image")
    // private String image;

}
