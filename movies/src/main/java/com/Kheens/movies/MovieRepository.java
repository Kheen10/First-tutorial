package com.Kheens.movies;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends MongoRepository<movie, ObjectId>{ 
    Optional<movie> findByImdbId(String imdbId);
}
