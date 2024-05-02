package com.example.cp2java.repository;

import com.example.cp2java.model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrinquedoRepository extends JpaRepository<Brinquedo, Integer> {
    Brinquedo findById(int id);
    Brinquedo save(Brinquedo brinquedo);
}