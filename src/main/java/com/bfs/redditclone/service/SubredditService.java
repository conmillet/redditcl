package com.bfs.redditclone.service;

import com.bfs.redditclone.dto.SubredditDto;
import com.bfs.redditclone.exceptions.SpringRedditException;
import com.bfs.redditclone.mapper.SubredditMapper;
import com.bfs.redditclone.model.Subreddit;
import com.bfs.redditclone.repository.SubredditRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@AllArgsConstructor
@Slf4j
public class SubredditService {

    private final SubredditRepository subredditRepository;
    private final SubredditMapper subredditMapper;

    @Transactional
    public SubredditDto save(SubredditDto subredditDto) {
        Subreddit save = subredditRepository.save(subredditMapper.mapDtoToSubreddit(subredditDto));
        subredditDto.setId(save.getId());
        return subredditDto;
    }

    public SubredditDto getSubreddit(Long id) {
        Subreddit subreddit = subredditRepository.findById(id)
                .orElseThrow(() -> new SpringRedditException("No Subreddit found with ID - " + id));
        return subredditMapper.mapSubredditToDto(subreddit);
    }
}
