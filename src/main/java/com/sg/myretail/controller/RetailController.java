
package com.sg.myretail.controller;

import com.sg.myretail.model.Product;
import com.sg.myretail.service.RetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retail")
public class RetailController {
    
    @Autowired
    RetailService service;
    
    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return service.getProductById(productId);

    }
    
    @PutMapping("/products/{productId}")
  public void modifyProductById(@PathVariable int productId, @RequestBody Product product) {
      service.updatePrice(productId, product);
  }

}
