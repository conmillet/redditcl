package com.bfs.redditclone.repository;

import com.bfs.redditclone.model.Comment;
import com.bfs.redditclone.model.Post;
import com.bfs.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository  extends JpaRepository<Comment, Long> {

    List<Comment> findBy(Post post);

    List<Comment> findAllByUser(User user);
}