package com.example.demo.persistence.utilities;

import com.example.demo.persistence.entities.Product;
import com.example.demo.persistence.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductGateway {

//    ProductFinder productFinder = new ProductFinder();
//    @Autowired
//    ProductRepository productRepository = ContextProvider.getBean(ProductRepository.class);
//
//    public void loadProducts() throws IOException {
//
//        List<Product> products = new ArrayList<Product>();
//
//        try {
//            products = productFinder.getProducts();
//
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//
//        for (Product product : products) {
//            List<Product> productsAlreadyInDB = productRepository.findByName(product.getName());
//            if (productsAlreadyInDB.size() == 0) {
//                //daca nu exista produsul in baza de date, atunci le inseram
//                productRepository.save(product);
//            } else {
//                //daca exista, stergem vechiul produs si punem varianta noua
//                for (Product product1 : productsAlreadyInDB)
//                    productRepository.delete(product1);
//                productRepository.save(product);
//            }
//        }
//
//
//    }
}

