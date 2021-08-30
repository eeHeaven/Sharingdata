package com.example.sharingdata.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class reportReason {

    @Id
    @GeneratedValue
    private long reportReasonId;

    @NotNull
    private String reason;
}
