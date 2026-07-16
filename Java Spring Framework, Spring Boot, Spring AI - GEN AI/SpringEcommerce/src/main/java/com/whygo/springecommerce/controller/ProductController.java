package com.whygo.springecommerce.controller;

import com.whygo.springecommerce.model.Product;
import com.whygo.springecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {

        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.ACCEPTED);

//        return "All products";
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = service.getProductById(id);
        if (product.getId() > 0)
            return new ResponseEntity<>(product, HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        Product prd = null;
        try {
            prd = service.addProduct(product, imageFile);
            return new ResponseEntity<>(prd, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }


    }
}
