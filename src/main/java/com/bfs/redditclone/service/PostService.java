package com.bfs.redditclone.service;


import com.bfs.redditclone.model.User;
import com.bfs.redditclone.repository.PostRepository;
import com.bfs.redditclone.repository.SubredditRepository;
import com.bfs.redditclone.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class PostService {

    private final PostRepository postRepository;
    private final SubredditRepository subredditRepository;
    private final UserRepository userRepository;
    private final AuthService authService;
    private final PostMapper postMapper;
}
