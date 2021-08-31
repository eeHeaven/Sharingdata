package com.example.sharingdata.domain.comment;

import com.example.sharingdata.domain.member.Member;
import com.example.sharingdata.domain.report;
import com.example.sharingdata.domain.sharePoint;

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
