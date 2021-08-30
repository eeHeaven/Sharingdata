package com.example.sharingdata.dto;

import com.example.sharingdata.domain.member.Member;
import com.example.sharingdata.domain.post.Post;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class PostMainResponseDto {
    private Long postId;
    private String title;
    private String author;
    private String modifiedDate;

    public PostMainResponseDto(Post entity){
        postId = entity.getPostId();
        title = entity.getTitle();
        author = entity.getAuthor().getNickname();
        modifiedDate = toStringDateTime(entity.getModifiedDate());


    }

    private String toStringDateTime(LocalDateTime modifiedDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(modifiedDate)
                .map(formatter::format)
                .orElse("");
    }
}
