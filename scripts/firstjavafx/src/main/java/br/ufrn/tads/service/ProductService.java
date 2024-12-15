package br.ufrn.tads.service;

import java.util.List;

import br.ufrn.tads.model.Product;
import br.ufrn.tads.repository.ProductDao;

public class ProductService {
    
    private ProductDao productDao;
    
    public List<Product> getProducts() {
        productDao = new ProductDao();
        return productDao.findAll();
    }

    public int save(Product product) {
        productDao = new ProductDao();
        return productDao.save(product);
    }
}
 
