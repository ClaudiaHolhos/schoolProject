package com.example.demo.controller;

import com.example.demo.persistence.entities.Customer;
import com.example.demo.persistence.entities.Product;
import com.example.demo.persistence.entities.Sale;
import com.example.demo.persistence.repositories.CustomerRepository;
import com.example.demo.persistence.repositories.SaleRepository;
import com.example.demo.services.CustomerService;
import com.example.demo.services.ProductService;
import com.example.demo.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/customer")
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CustomerService customerService;
    @Autowired
    ProductService productService;
    @Autowired
    SaleService saleService;
    @Autowired
    SaleRepository saleRepository;

    @RequestMapping(value = "/insertCustomer", method  = RequestMethod.POST)
    @ResponseBody
    public void insertCustomer(@RequestBody Customer customer){
        Customer customer1 = new Customer(customer);
        System.out.println(customer1);
        if (customer != null)
            System.out.println(customerRepository.save(customer1));
    }

    @RequestMapping(value = "/deleteCustomer", method  = RequestMethod.POST)
    @ResponseBody
    public void deleteCustomer(@RequestBody Customer customer){
        Customer customer1 = new Customer(customer);
        System.out.println(customer1);
        if (customer != null)
            customerRepository.delete(customer1);
    }

    @RequestMapping(value ="/viewProducts", method = RequestMethod.GET)
    public List<Product> viewProducts(){
        System.out.println(customerService.viewAllProducts());
       return customerService.viewAllProducts();

    }

    @RequestMapping(value = "/customerLogin", method = RequestMethod.POST)
    @ResponseBody
    public Customer adminLogin(@RequestBody Customer customer){
        Customer newCustomer = new Customer(customer);
        System.out.println(newCustomer);
        return customerService.customerLogin(newCustomer);
    }

    @RequestMapping(value = "/buyItem", method = RequestMethod.POST)
    @ResponseBody
    public void buyItem(@RequestBody Product product) {
        int id = product.getId();
        Product p = new Product (productService.findById(id));
        customerService.lowStock(p);


       Sale s = new Sale();
        s.setProductId(p.getId());
        s.setSum(p.getPrice());
        s.setQuantity(1);

        saleService.saveSale(s);
        int stock = p.getStock();
        System.err.println(id);
        System.err.println(stock);
        System.err.println(p);
    }








//    @RequestMapping(value ="/viewHardwareProducts", method = RequestMethod.GET)
//    public List<Product> viewHardwareProducts(){
//        return productService.findHardwareProduct();
//    }
//
//
//    @RequestMapping(value ="/viewSoftwareProducts", method = RequestMethod.GET)
//    public List<Product> viewSoftwareProducts(){
//        return productService.findSoftwareProduct();
//    }
}
