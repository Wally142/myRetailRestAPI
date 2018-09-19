package com.sg.myretail.service;

import com.sg.myretail.model.Product;
import com.sg.myretail.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class RetailService {

    @Autowired
    private ProductRepository repository;

    public Product getProductById(int productId) {
        return repository.findBy_id(productId);
    }

    public void updatePrice(int productId, Product product) {
        repository.save(product);
    }
}
