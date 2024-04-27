package dev.Kheen.QA.QC.controllers;

import org.springframework.web.bind.annotation.RestController;

import dev.Kheen.QA.QC.models.Product;
import dev.Kheen.QA.QC.repository.ProductRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/products")

public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping()
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    
}
