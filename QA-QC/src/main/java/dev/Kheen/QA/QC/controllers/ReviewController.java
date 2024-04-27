package dev.Kheen.QA.QC.controllers;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.Kheen.QA.QC.models.Product;
import dev.Kheen.QA.QC.models.Reviews;
import dev.Kheen.QA.QC.repository.ProductRepository;
import dev.Kheen.QA.QC.repository.ReviewRepository;

@RestController
@RequestMapping("/product")
public class ReviewController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ReviewRepository  reviewRepository;

    @PostMapping("/{productId}")
    public Product addReviewId(@PathVariable String productId, @RequestBody Map<String, String> payload) {
        // Save the email and productId in the ProductReview collection
        Reviews review = new Reviews();
        review.setProductId(productId);
        review.setEmail(payload.get("email"));
        String reviewId = UUID.randomUUID().toString();
        review.setReviewId(reviewId);
        reviewRepository.save(review);

        Product product = productRepository.findByProductId(productId);
        product.getComments().add(payload.get("reviewText")); 
        return productRepository.save(product);
    }
    
}
