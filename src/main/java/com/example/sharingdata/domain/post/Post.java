package com.example.sharingdata.domain.post;

import com.example.sharingdata.domain.*;
import com.example.sharingdata.domain.member.Member;
import com.example.sharingdata.domain.hashTag;
import com.example.sharingdata.domain.image;
import com.example.sharingdata.domain.report;
import com.example.sharingdata.domain.sharePoint;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Post extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long postId;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String context;


    @ManyToOne
    private Member author;

    @Builder
    public Post(String title, String context, Member author){
        this.title = title;
        this.context = context;
        this.author = author;
    }



}
