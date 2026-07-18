package com.whygo.springecommerce.service;

import com.whygo.springecommerce.model.Product;
import com.whygo.springecommerce.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(new Product(-1));
    }

    public Product addOrUpdateProduct(Product product, MultipartFile image) throws IOException {
        product.setId(0); // Ensure id is null/0 for new entities
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());
        return repository.save(product);
    }

    public void deleteProduct(int id) {
        repository.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return repository.searchProducts(keyword);
    }
}
