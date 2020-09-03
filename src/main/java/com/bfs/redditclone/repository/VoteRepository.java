package com.bfs.redditclone.repository;

import com.bfs.redditclone.model.Post;
import com.bfs.redditclone.model.User;
import com.bfs.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
