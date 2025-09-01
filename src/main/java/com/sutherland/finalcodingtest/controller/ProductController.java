package com.sutherland.finalcodingtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sutherland.finalcodingtest.service.Product;

@RestController
public class ProductController {
	@Autowired
	Product service;
	
	@GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }
	
	@GetMapping("/getByTypeAndPrice")
    public List<Product> getByTypeAndPrice(@RequestParam String type, @RequestParam double price) {
        return service.getProductsByTypeAndPrice(type, price);
    }
}
