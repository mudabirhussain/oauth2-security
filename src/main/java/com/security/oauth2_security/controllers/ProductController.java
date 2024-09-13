package com.security.oauth2_security.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping
    public String productHome(){
        return "Welcome to the products world!";
    }

    @GetMapping("/products/all")
    public List<String> allProducts() {
        return List.of("Dove", "Colgate", "Pepsi", "Nestle", "Coffee");
    }

    @GetMapping("/products/add")
    public String addProduct(@RequestParam("product") String product) {
        return product + " product is added successfully";
    }
}
