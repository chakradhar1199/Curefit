package com.chakri.curefit.models;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Basemodel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @CreatedDate
    private Date createDate;

    @LastModifiedDate
    private Date modifiedDate;
}
