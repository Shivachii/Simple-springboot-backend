package com.Backend.urbaneswim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.urbaneswim.model.Kids;

@Repository
public interface KidsProdRepo extends JpaRepository<Kids, Integer> {

}
