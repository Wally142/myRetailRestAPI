
package com.sg.myretail.data;

import com.sg.myretail.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class RetailDaoImpl implements RetailDao {

    @Override
    public Product getProductPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
