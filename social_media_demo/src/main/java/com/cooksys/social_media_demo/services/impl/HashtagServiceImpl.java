package com.cooksys.social_media_demo.services.impl;

import com.cooksys.social_media_demo.mappers.HashtagMapper;
import com.cooksys.social_media_demo.repositories.HashtagRepository;
import com.cooksys.social_media_demo.services.HashtagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HashtagServiceImpl implements HashtagService {

    private HashtagRepository hashtagRepository;

    private HashtagMapper hashtagMapper;


}
