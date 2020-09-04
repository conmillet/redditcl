package com.bfs.redditclone.service;

import com.bfs.redditclone.dto.PostRequest;
import com.bfs.redditclone.repository.PostRepository;
import com.bfs.redditclone.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentService {
    private static final String POST_URL = "";
    private final PostRepository postRepository;
    private final UserRepository userRepository;
    private final AuthService authService;
    private final CommentMapper
}
