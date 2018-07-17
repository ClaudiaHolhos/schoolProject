package com.example.demo.persistence.cache;

import com.example.demo.persistence.entities.Product;
import com.example.demo.persistence.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CacheManager {

//    private ProductCache productCache = ProductCache.getInstance();
//    private int elapsedSeconds;
//    @Autowired
//    private ProductRepository productRepository;
//
//
//    public List<Product> findHardwareProducts() {
//        List<Product> products = null;
//        if (productCache.empty()) {
//            System.out.println("Cache is empty, go to DataBase!");
//            products = productRepository.findByCategory("hardware");
//            productCache.updateProductCacheContents(products);
//        } else {
//            products = productCache.getHardwareProducts();
//            System.out.println("Products taken from Cache");
//        }
//        return products;
//
//    }
//
//    public List<Product> findSoftwareProducts() {
//
//        List<Product> products = null;
//        if (productCache.empty()) {
//            System.out.println("Cache is empty, go to DataBase!");
//            products = productRepository.findByCategory("software");
//            productCache.updateProductCacheContents(products);
//        } else {
//            products = productCache.getSoftwareProducts();
//            System.out.println("Products taken from Cache");
//
//        }
//        return products;
//
//    }
}
