package com.example.sharingdata.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

public interface PostRepository extends JpaRepository<Post,Long> {

    @Query("SELECT p " +
            "FROM Post p " +
            "ORDER BY p.postId DESC")
    Stream<Post> findAllDesc();
}
