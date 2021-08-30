package com.example.sharingdata.domain.post;

import com.example.sharingdata.dto.PostMainResponseDto;
import com.example.sharingdata.dto.PostSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostService {

    private PostRepository postRepository;

    @Transactional
    public long save(PostSaveRequestDto dto){
        return postRepository.save(dto.toEntity()).getPostId();
    }

    @Transactional
    public List<PostMainResponseDto> findAllDesc(){
        return postRepository.findAllDesc()
                .map(PostMainResponseDto::new)
                .collect(Collectors.toList());

    }
}
