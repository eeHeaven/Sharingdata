package com.example.sharingdata.dto;

import com.example.sharingdata.domain.member.Member;
import com.example.sharingdata.domain.post.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Setter
@Getter
@NoArgsConstructor
public class PostSaveRequestDto {

    private String title;
    private String context;
    private Timestamp timestamp;
    private Member author;

    @Builder
    public PostSaveRequestDto(String title, String context,Member author){
        this.title = title;
        this.context = context;
        this.author = author;
    }

    public Post toEntity(){
        return Post.builder()
                .title(title)
                .context(context)
                .author(author)
                .build();
    }
}
