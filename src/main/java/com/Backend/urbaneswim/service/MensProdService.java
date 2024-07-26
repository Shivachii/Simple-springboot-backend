package com.Backend.urbaneswim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.urbaneswim.model.Mens;
import com.Backend.urbaneswim.repository.MensProductRepo;

@Service
public class MensProdService {

    @Autowired
    MensProductRepo repo;

    // Method to get all
    public List<Mens> getMensProducts() {

        return repo.findAll();
    }

    // Method to search by Id *filters*
    public Mens getMensProdById(int Id) {
        return repo.findById(Id).orElse(new Mens());

    }

    // Method to add product
    public void addMensProduct(Mens prod) {
        repo.save(prod);
    }

    // Method to update product
    public void updateMensProduct(Mens prod) {

        repo.save(prod);
    }

    // Method to delete product
    public void deleteMensProduct(int Id) {
        repo.deleteById(Id);
    }
}
