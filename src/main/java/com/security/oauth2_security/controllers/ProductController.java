package com.security.oauth2_security.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/products")
public class ProductController {

    @GetMapping("/public/all")
    public List<String> allProducts() {
        return List.of("Dove", "Colgate", "Pepsi", "Nestle", "Coffee");
    }

    @PostMapping("/private/add")
    public String addProduct(@RequestParam String product) {
        return product + "product is added successfully";
    }
}
