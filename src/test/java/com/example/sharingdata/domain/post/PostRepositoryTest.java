package com.example.sharingdata.domain.post;

import com.example.sharingdata.domain.member.Member;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @AfterEach
    public void cleanup(){
        postRepository.deleteAll();
    }

    @Test
    public void 게시글저장및불러오기(){
        postRepository.save(Post.builder()
        .title("안녕하세요")
        .context("반갑습니다")
        .author(Member.builder().nickname("이혜빈").build())
        .build());

        List<Post> postList = postRepository.findAll();

        Post post = postList.get(0);
        assert(post.getAuthor().getNickname().equals("이혜빈"));
        assert(post.getTitle().equals("안녕하세요"));
    }

    @Test
    public void baseEntity등록(){
        //given
        LocalDateTime now = LocalDateTime.now();
        postRepository.save(Post.builder()
                .title("안녕")
                .context("안녕하세요")
                .author(Member.builder().build())
                .build()
        );
        //when
        List<Post> posts = postRepository.findAll();
        //then
        Post post = posts.get(0);
        assert(post.getCreateDate().isAfter(now));
        assert(post.getModifiedDate().isAfter(now));
    }
}
