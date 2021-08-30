package com.example.sharingdata.domain.member;

import com.example.sharingdata.domain.comment;
import com.example.sharingdata.domain.post.Post;
import com.example.sharingdata.domain.report;
import com.example.sharingdata.domain.sharePoint;
import com.example.sharingdata.domain.shareRank;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Member {

    @Id
    private String memberID;

    @NotNull
    private String email;

    @NotNull
    private String nickname;

    @NotNull
    private String password;

    private boolean isBlocked;

    @OneToMany
    private List<Post> posts;

    @OneToMany
    private List<comment> comments;

    @OneToMany
    private List<report> reports;

    @OneToOne
    private shareRank rank;

    @OneToOne
    private sharePoint point;


}
