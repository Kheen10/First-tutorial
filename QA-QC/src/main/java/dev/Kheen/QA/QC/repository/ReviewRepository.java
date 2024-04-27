package dev.Kheen.QA.QC.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import dev.Kheen.QA.QC.models.Reviews;

@Repository
public interface ReviewRepository extends MongoRepository<Reviews,String>{
    
}
