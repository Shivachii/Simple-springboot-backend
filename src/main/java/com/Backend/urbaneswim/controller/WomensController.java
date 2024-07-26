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

import com.Backend.urbaneswim.model.Womens;
import com.Backend.urbaneswim.service.WomensProdService;

@RestController
@CrossOrigin
@RequestMapping("/womens-api")
public class WomensController {

    @Autowired
    WomensProdService service;

    // retireve from db
    @GetMapping("/products")
    public List<Womens> getWomensProducts() {
        return service.getWomensProducts();
    }

    // get prod by ID
    @GetMapping("/products/{Id}")
    public Womens getWomensProdById(@PathVariable int Id) {
        return service.getWomensProdById(Id);
    }

    // Add using Post
    @PostMapping("/products")
    public void addWomensProduct(@RequestBody Womens prod) {
        service.addWomensProduct(prod);
        System.out.println(prod);

    }

    // update using Put request
    @PutMapping("/products")
    public void updateWomensProduct(@RequestBody Womens prod) {
        service.updateWomensProduct(prod);
        System.out.println(prod);
    }

    // delete using Put request
    @DeleteMapping("/products/{prodId}")
    public void deleteWomensProduct(@PathVariable int Id) {
        service.deleteWomensProduct(Id);

    }
}
