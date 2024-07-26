package com.Backend.urbaneswim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.urbaneswim.model.Womens;
import com.Backend.urbaneswim.repository.WomensProductRepo;

@Service
public class WomensProdService {

    @Autowired
    WomensProductRepo repo;

    // Method to get all
    public List<Womens> getWomensProducts() {

        return repo.findAll();
    }

    // Method to search by Id *filters*
    public Womens getWomensProdById(int Id) {
        return repo.findById(Id).orElse(new Womens());

    }

    // Method to add product
    public void addWomensProduct(Womens prod) {
        repo.save(prod);
    }

    // Method to update product
    public void updateWomensProduct(Womens prod) {

        repo.save(prod);
    }

    // Method to delete product
    public void deleteWomensProduct(int Id) {
        repo.deleteById(Id);
    }

}
