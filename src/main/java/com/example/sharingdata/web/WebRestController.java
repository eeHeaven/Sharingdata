package com.example.sharingdata.web;

import com.example.sharingdata.domain.post.Post;
import com.example.sharingdata.domain.post.PostRepository;
import com.example.sharingdata.dto.PostSaveRequestDto;
import com.example.sharingdata.service.PostService;
import lombok.AllArgsConstructor;
import org.hibernate.cfg.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostRepository postRepository;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Hyebin!";
    }

    @PostMapping("/save")
    public void savePosts(@RequestBody PostSaveRequestDto dto){
        postRepository.save(dto.toEntity());
    }



}
