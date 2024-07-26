package com.Backend.urbaneswim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.urbaneswim.model.Accessories;

@Repository
public interface AccessoriesRepo extends JpaRepository<Accessories, Integer> {

}
