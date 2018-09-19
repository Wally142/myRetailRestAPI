
package com.sg.myretail.data;

import com.sg.myretail.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface RetailDao {
    
    public Product getProductPrice();
    
    public ResponseEntity getProductById(int id);
    
}
