package com.example.sharingdata.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class report {

    @Id
    @GeneratedValue
    private long reportId;

    private Integer reportcount;
}
