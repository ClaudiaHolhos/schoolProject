package com.example.demo.services;

import com.example.demo.persistence.entities.Customer;
import com.example.demo.persistence.entities.Product;
import com.example.demo.persistence.entities.Sale;
import com.example.demo.persistence.repositories.CustomerRepository;
import com.example.demo.persistence.repositories.ProductRepository;
import com.example.demo.persistence.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ContextHolder contextHolder;


   public List<Product> viewAllProducts(){
        return productRepository.findAll();
    }

    public Customer saveCustomer(Customer customer){
      return customerRepository.save(customer);
    }

    public void deleteCustomer(Customer customer){
        customerRepository.delete(customer);
    }

    public Customer customerLogin(Customer c){
        Customer customer = customerRepository.findByEmail(c.getEmail());
        if (customer != null && customer.getPassword().equals(c.getPassword())) {
            this.contextHolder.setUser(customer);
            System.out.println(customer);
            return customer;
        }
        else
            return null;
    }

    public Customer getLoggedCustomer(){

       if(this.contextHolder.getLoggedInUser().getClass().equals("Customer")){
           return (Customer) this.contextHolder.getLoggedInUser();
       }
       return null;
    }

    public void lowStock(Product p){
       if(p.getStock()==0){
           System.out.println("Stoc nul!");
       }else {
           p.setStock(p.getStock() - 1);
       }
        productRepository.save(p);

    }
}
