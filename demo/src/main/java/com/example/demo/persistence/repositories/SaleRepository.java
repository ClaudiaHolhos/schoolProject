package com.example.demo.persistence.repositories;
import com.example.demo.persistence.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
    Sale findById(int id);
}
