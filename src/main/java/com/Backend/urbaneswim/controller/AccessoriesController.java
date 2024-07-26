package com.Backend.urbaneswim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.Backend.urbaneswim.model.Accessories;
import com.Backend.urbaneswim.service.AccessoriesService;

@RestController
@CrossOrigin
@RequestMapping("/accessories-api")
public class AccessoriesController {

    @Autowired
    AccessoriesService service;

    // retireve from db
    @GetMapping("/products")
    public List<Accessories> getProducts() {
        return service.getProducts();
    }

    // get prod by ID
    @GetMapping("/products/{Id}")
    public Accessories getProdById(@PathVariable int Id) {
        return service.getProdById(Id);
    }

    // Add using Post
    @PostMapping("/products")
    public void addProduct(@RequestBody Accessories prod) {
        service.addProduct(prod);
        System.out.println(prod);

    }

    // update using Put request
    @PutMapping("/products")
    public void updateProduct(@RequestBody Accessories prod) {
        service.updateProduct(prod);
        System.out.println(prod);
    }

    // delete using Put request
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int Id) {
        service.deleteProduct(Id);

    }

}
