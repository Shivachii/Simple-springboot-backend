package com.Backend.urbaneswim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.urbaneswim.model.Womens;

@Repository
public interface WomensProductRepo extends JpaRepository<Womens, Integer> {

}
