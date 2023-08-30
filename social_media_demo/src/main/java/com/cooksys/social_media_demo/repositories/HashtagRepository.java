package com.cooksys.social_media_demo.repositories;

import com.cooksys.social_media_demo.entities.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashtagRepository extends JpaRepository<Hashtag, Long> {

}
