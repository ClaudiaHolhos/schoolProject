package com.example.demo.services;

import com.example.demo.persistence.entities.Admin;
import com.example.demo.persistence.entities.Customer;
import com.example.demo.persistence.entities.Product;
import com.example.demo.persistence.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    CustomerService customerService;
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    ProductService productService;
    @Autowired
    ContextHolder contextHolder;

    public Customer saveCustomer(Customer c) {
        return customerService.saveCustomer(c);
    }

    public void deleteCustomer(Customer c) {
        customerService.deleteCustomer(c);
    }

    public Product saveProduct(Product p) {

        return productService.saveProduct(p);
    }

    public void deleteProduct(Product p) {
        productService.deleteProduct(p);
    }

    public Admin adminLogin(Admin a) {
        Admin admin = adminRepository.findByEmail(a.getEmail());
        if (admin != null && admin.getPassword().equals(a.getPassword())) {
            this.contextHolder.setUser(admin);
            return admin;
        }
        else
            return null;
    }
}