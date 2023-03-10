package com.crud.mongoDB.repository;

import com.crud.mongoDB.model.ProductDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface ProductRepository extends MongoRepository<ProductDetails, Long> {
}
