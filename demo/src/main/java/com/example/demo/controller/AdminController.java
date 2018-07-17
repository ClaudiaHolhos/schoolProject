package com.example.demo.controller;
import com.example.demo.persistence.entities.Admin;
import com.example.demo.persistence.entities.Product;
import com.example.demo.persistence.repositories.AdminRepository;
import com.example.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    AdminRepository adminRepository;
    @Autowired
    AdminService adminService;

    @PostMapping(value = "/insertAdmin")
    @ResponseBody
    public void insertAdmin(@RequestBody Admin admin){
        Admin admin1 = new Admin(admin);
        System.out.println(admin1);
        if (admin != null)
            System.out.println(adminRepository.save(admin1));
    }

    @RequestMapping(value = "/deleteAdmin", method  = RequestMethod.POST)
    @ResponseBody
    public void deleteAdmin(@RequestBody Admin admin){
        Admin admin1 = new Admin(admin);
        System.out.println(admin1);
        if (admin != null)
            adminRepository.delete(admin1);
    }

    @RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
    @ResponseBody
    public void deleteProduct(@RequestBody Product product){
        Product p = new Product(product);
        System.out.println(p);
         adminService.deleteProduct(p);

    }

    @RequestMapping(value = "/insertProduct", method = RequestMethod.POST)
    @ResponseBody
    public void insertProduct(@RequestBody Product product){
        Product p =new Product(product);
        System.out.println(p);
        System.out.println( adminService.saveProduct(p));
    }

    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
    @ResponseBody
    public Admin adminLogin(@RequestBody Admin admin){
        Admin newAdmin = new Admin(admin);
        return adminService.adminLogin(newAdmin);
    }
}
