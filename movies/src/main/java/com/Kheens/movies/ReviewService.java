package com.Kheens.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private reviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public review createReview(String reviewBody, String imdbId) {
        review newReview = reviewRepository.insert(new review(reviewBody));

        mongoTemplate.update(movie.class)
                     .matching(Criteria.where("imdbId").is(imdbId))
                     .apply(new Update().push("reviewId", newReview))
                     .first();

        return newReview;
    }

}
