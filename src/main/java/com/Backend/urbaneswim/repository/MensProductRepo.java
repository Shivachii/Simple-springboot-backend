package com.Backend.urbaneswim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.urbaneswim.model.Mens;

@Repository
public interface MensProductRepo extends JpaRepository<Mens, Integer> {

}
