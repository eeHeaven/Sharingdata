package com.example.sharingdata.domain.member;

import com.example.sharingdata.domain.comment.comment;
import com.example.sharingdata.domain.post.Post;
import com.example.sharingdata.domain.report;
import com.example.sharingdata.domain.sharePoint;
import com.example.sharingdata.domain.shareRank;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberID;

    @NotNull
    private String nickname;


    @OneToMany
    private List<Post> posts;

    @Builder
    public Member(String nickname, List<Post> posts){
        this.nickname = nickname;
        this.posts = posts;
    }



}
