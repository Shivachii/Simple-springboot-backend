package com.Backend.urbaneswim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.urbaneswim.model.Kids;
import com.Backend.urbaneswim.repository.KidsProdRepo;

@Service
public class KidsProductsService {

    @Autowired
    KidsProdRepo repo;

    // Method to get all
    public List<Kids> getKids() {

        return repo.findAll();
    }

    // Method to search by Id *filters*
    public Kids getKidsProdById(int Id) {
        return repo.findById(Id).orElse(new Kids());

    }

    // Method to add product
    public void addKidsProduct(Kids prod) {
        repo.save(prod);
    }

    // Method to update product
    public void updateKidsProduct(Kids prod) {

        repo.save(prod);
    }

    // Method to delete product
    public void deleteKidsProduct(int Id) {
        repo.deleteById(Id);
    }

}
