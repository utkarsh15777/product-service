package com.tuppertech.microservices.product.repository;

import com.tuppertech.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
