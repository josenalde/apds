package br.ufrn.tads.service;

import java.util.List;

import br.ufrn.tads.model.Product;
import br.ufrn.tads.repository.ProductDao;

public class ProductService {
    
    private ProductDao productDao;

    public ProductService() {
        productDao = new ProductDao();
    }
   
    public List<Product> getProducts() {
        return productDao.findAll();
    }

    public boolean save(Product product) {
        return productDao.save(product);
    }

    public boolean update(Product product, String[] params) {
        return productDao.update(product, params);
    }

    public boolean delete(Long id) {
        return productDao.delete(id);
    }
}
 
