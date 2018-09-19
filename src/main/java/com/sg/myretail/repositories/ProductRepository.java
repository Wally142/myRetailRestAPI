package com.sg.myretail.repositories;

import com.sg.myretail.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

    Product findBy_id(int id);
}
