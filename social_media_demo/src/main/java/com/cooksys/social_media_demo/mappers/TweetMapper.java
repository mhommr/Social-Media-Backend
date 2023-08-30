package com.cooksys.social_media_demo.mappers;

import com.cooksys.social_media_demo.dtos.TweetRequestDto;
import com.cooksys.social_media_demo.entities.Tweet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { UserMapper.class })
public interface TweetMapper {

    Tweet requestToEntity(TweetRequestDto tweetRequestDto);

}