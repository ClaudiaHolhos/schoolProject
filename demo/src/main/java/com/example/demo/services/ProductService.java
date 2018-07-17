package com.example.demo.services;

import com.example.demo.persistence.cache.CacheManager;
import com.example.demo.persistence.entities.Product;
import com.example.demo.persistence.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
//    @Autowired
//    CacheManager cacheManager;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Product product){
        productRepository.delete(product);
    }

    public Product findById(int id){
       return productRepository.findById(id);
    }


//    public Product findByName(String name){
//
//    }public List<Product> findHardwareProduct() {return cacheManager.findHardwareProducts();}
//
//    public List<Product> findSoftwareProduct() {return cacheManager.findSoftwareProducts();}

    


}
