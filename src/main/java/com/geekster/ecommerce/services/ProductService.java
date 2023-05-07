package com.geekster.ecommerce.services;
import com.geekster.ecommerce.models.Product;
import com.geekster.ecommerce.repositories.IProductDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductDao productDao;

    public void createProduct(Product product) {
        productDao.save(product);
    }

    public Iterable<Product> getAllProducts() {
        return productDao.findAll();
    }

    public Optional<Product> fetchProductsByCategory(String category) {
        return productDao.findProductByCategory(category);
    }

    @Transactional
    public void removeProductById(Integer productId) {
        productDao.deleteById(productId);
    }
}
