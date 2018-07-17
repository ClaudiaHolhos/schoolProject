package com.example.demo.services;

import com.example.demo.persistence.entities.Sale;
import com.example.demo.persistence.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    public Sale saveSale(Sale sale){
        return saleRepository.save(sale);
    }

    public void deleteSale(Sale sale){
        saleRepository.delete(sale);
    }

    public Sale findById(int id){
        return saleRepository.findById(id);
    }

}
