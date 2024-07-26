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

import com.Backend.urbaneswim.model.Kids;
import com.Backend.urbaneswim.service.KidsProductsService;

@RestController
@CrossOrigin
@RequestMapping("/kids-api")
public class KidsController {

    @Autowired
    KidsProductsService service;

    // retireve from db
    @GetMapping("/products")
    public List<Kids> getKids() {
        return service.getKids();
    }

    // get prod by ID
    @GetMapping("/products/{Id}")
    public Kids getKidsProdById(@PathVariable int Id) {
        return service.getKidsProdById(Id);
    }

    // Add using Post
    @PostMapping("/products")
    public void addKidsProduct(@RequestBody Kids prod) {
        service.addKidsProduct(prod);
        System.out.println(prod);

    }

    // update using Put request
    @PutMapping("/products")
    public void updateKidsProduct(@RequestBody Kids prod) {
        service.updateKidsProduct(prod);
        System.out.println(prod);
    }

    // delete using Put request
    @DeleteMapping("/products/{prodId}")
    public void deleteKidsProduct(@PathVariable int Id) {
        service.deleteKidsProduct(Id);

    }
}
