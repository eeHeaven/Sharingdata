package com.example.sharingdata.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class sharePoint {

    @Id
    @GeneratedValue
    private long sharePointId;

    @NotNull
    private Integer sharepoint;


}
