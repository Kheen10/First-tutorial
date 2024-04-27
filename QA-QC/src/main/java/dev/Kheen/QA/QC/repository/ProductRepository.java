
package dev.Kheen.QA.QC.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import dev.Kheen.QA.QC.models.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
    Product findByProductId(String productId);
}