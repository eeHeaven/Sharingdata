package com.example.sharingdata.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class comment {

    @Id
    @GeneratedValue
    private Long commentId;

    private String context;

    private Timestamp timestamp;

    private Integer likes;

    @ManyToOne
    private Member member;

    @OneToMany
    private List<report> reports;

    @OneToOne
    private sharePoint point;
}
