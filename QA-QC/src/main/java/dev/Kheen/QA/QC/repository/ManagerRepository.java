package dev.Kheen.QA.QC.repository;
import dev.Kheen.QA.QC.models.Manager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends MongoRepository<Manager,String> {
    Manager findByReviewId(String reviewId);

}