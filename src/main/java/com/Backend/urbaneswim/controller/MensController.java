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

import com.Backend.urbaneswim.model.Mens;
import com.Backend.urbaneswim.service.MensProdService;

@RestController
@CrossOrigin
@RequestMapping("/mens-api")
public class MensController {

    @Autowired
    MensProdService service;

    // retireve from db
    @GetMapping("/products")
    public List<Mens> getMensProducts() {
        return service.getMensProducts();
    }

    // get prod by ID
    @GetMapping("/products/{Id}")
    public Mens getMensProdById(@PathVariable int Id) {
        return service.getMensProdById(Id);
    }

    // Add using Post
    @PostMapping("/products")
    public void addMensProduct(@RequestBody Mens prod) {
        service.addMensProduct(prod);
        System.out.println(prod);

    }

    // update using Put request
    @PutMapping("/products")
    public void updateMensProduct(@RequestBody Mens prod) {
        service.updateMensProduct(prod);
        System.out.println(prod);
    }

    // delete using Put request
    @DeleteMapping("/products/{Id}")
    public void deleteMensProduct(@PathVariable int Id) {
        service.deleteMensProduct(Id);

    }
}
