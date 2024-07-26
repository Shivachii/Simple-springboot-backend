package com.Backend.urbaneswim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.urbaneswim.model.Accessories;
import com.Backend.urbaneswim.repository.AccessoriesRepo;

@Service
public class AccessoriesService {

    @Autowired
    AccessoriesRepo repo;

    // Method to get all
    public List<Accessories> getProducts() {

        return repo.findAll();
    }

    // Method to search by Id *filters*
    public Accessories getProdById(int Id) {
        return repo.findById(Id).orElse(new Accessories());

    }

    // Method to add product
    public void addProduct(Accessories prod) {
        repo.save(prod);
    }

    // Method to update product
    public void updateProduct(Accessories prod) {

        repo.save(prod);
    }

    // Method to delete product
    public void deleteProduct(int Id) {
        repo.deleteById(Id);
    }
}
